package com.uhope.uip.mybatis.config;

import com.github.pagehelper.PageHelper;
import com.uhope.uip.mybatis.core.ProjectConstant;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Mybatis & Mapper & PageHelper 配置
 *
 * @author jiangjialiang on 2017/12/25
 * @version 3.0.0
 */
@Configuration
public class MybatisConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
         DataSource dataSource = DataSourceBuilder.create().build();
        return  dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTypeAliasesPackage(ProjectConstant.DOMAIN_PACKAGE);

        // 配置分页插件，详情请查阅官方文档
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("pageSizeZero", "true"); // 分页尺寸为0时查询所有纪录不再执行分页
        properties.setProperty("reasonable", "true");   // 页码<=0 查询第一页，页码>=总页数查询最后一页
        properties.setProperty("supportMethodsArguments", "true");  // 支持通过 Mapper 接口参数来传递分页参数
        pageHelper.setProperties(properties);

        // 添加插件
        factory.setPlugins(new Interceptor[]{pageHelper});

        // 添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/*.xml"));
        return factory.getObject();
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        mapperScannerConfigurer.setBasePackage(ProjectConstant.MAPPER_PACKAGE);

        // 配置通用Mapper，详情请查阅官方文档
        Properties properties = new Properties();
        properties.setProperty("`", ProjectConstant.MAPPER_INTERFACE_REFERENCE);
        properties.setProperty("notEmpty", "false");    // insert、update是否判断字符串类型!='' 即 test="str != null"表达式内是否追加 and str != ''
        properties.setProperty("IDENTITY", "MYSQL");
        /**
         * （Service.findByCondition --> ConditionMapper<T>）
         * 解决MyBatis通用插件Mapper调用条件查询报如下异常：
         * ----------------------------------------------------------------------------------------------------------
         * org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.builder.BuilderException:
         * Error invoking SqlProvider method (tk.mybatis.mapper.provider.ConditionProvider.dynamicSQL).
         * Cause: java.lang.InstantiationException: tk.mybatis.mapper.provider.ConditionProvider
         * ----------------------------------------------------------------------------------------------------------
         * mappers = 属性名称（固定写法）
         * com.uhope.uip.mybatis.core.Mapper = 通用Mapper包路径位置
         */
        properties.setProperty("mappers", "com.uhope.uip.mybatis.core.Mapper");
        mapperScannerConfigurer.setProperties(properties);

        return mapperScannerConfigurer;
    }

}

