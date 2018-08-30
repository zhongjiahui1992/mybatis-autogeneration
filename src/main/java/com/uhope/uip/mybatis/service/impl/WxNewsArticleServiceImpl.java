package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxNewsArticleMapper;
import com.uhope.uip.mybatis.domain.WxNewsArticle;
import com.uhope.uip.mybatis.service.WxNewsArticleService;
import com.uhope.uip.mybatis.dto.WxNewsArticleDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * -ServiceImpl接口实现类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Service
@Transactional
public class WxNewsArticleServiceImpl extends AbstractService<WxNewsArticle, WxNewsArticleDTO, String> implements WxNewsArticleService {
    @Resource
    private WxNewsArticleMapper wxNewsArticleMapper;

}
