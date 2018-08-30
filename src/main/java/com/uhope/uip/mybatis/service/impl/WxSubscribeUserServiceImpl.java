package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxSubscribeUserMapper;
import com.uhope.uip.mybatis.domain.WxSubscribeUser;
import com.uhope.uip.mybatis.service.WxSubscribeUserService;
import com.uhope.uip.mybatis.dto.WxSubscribeUserDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * 关注用户表-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
@Transactional
public class WxSubscribeUserServiceImpl extends AbstractService<WxSubscribeUser, WxSubscribeUserDTO, String> implements WxSubscribeUserService {
    @Resource
    private WxSubscribeUserMapper wxSubscribeUserMapper;

}
