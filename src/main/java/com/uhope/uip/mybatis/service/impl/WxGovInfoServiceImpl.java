package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxGovInfoMapper;
import com.uhope.uip.mybatis.domain.WxGovInfo;
import com.uhope.uip.mybatis.service.WxGovInfoService;
import com.uhope.uip.mybatis.dto.WxGovInfoDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * 政务信息-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
@Transactional
public class WxGovInfoServiceImpl extends AbstractService<WxGovInfo, WxGovInfoDTO, String> implements WxGovInfoService {
    @Resource
    private WxGovInfoMapper wxGovInfoMapper;

}
