package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxBindInfoMapper;
import com.uhope.uip.mybatis.domain.WxBindInfo;
import com.uhope.uip.mybatis.service.WxBindInfoService;
import com.uhope.uip.mybatis.dto.WxBindInfoDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * 用户绑定信息-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
@Transactional
public class WxBindInfoServiceImpl extends AbstractService<WxBindInfo, WxBindInfoDTO, String> implements WxBindInfoService {
    @Resource
    private WxBindInfoMapper wxBindInfoMapper;

}
