package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxMaterialFileMapper;
import com.uhope.uip.mybatis.domain.WxMaterialFile;
import com.uhope.uip.mybatis.service.WxMaterialFileService;
import com.uhope.uip.mybatis.dto.WxMaterialFileDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * 公众号素材-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
@Transactional
public class WxMaterialFileServiceImpl extends AbstractService<WxMaterialFile, WxMaterialFileDTO, String> implements WxMaterialFileService {
    @Resource
    private WxMaterialFileMapper wxMaterialFileMapper;

}
