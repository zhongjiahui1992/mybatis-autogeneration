package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.AppUserMapper;
import com.uhope.uip.mybatis.domain.AppUser;
import com.uhope.uip.mybatis.service.AppUserService;
import com.uhope.uip.mybatis.dto.AppUserDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * 公众用户表-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/06
 * @version 3.0.0
 */
@Service
@Transactional
public class AppUserServiceImpl extends AbstractService<AppUser, AppUserDTO, String> implements AppUserService {
    @Resource
    private AppUserMapper appUserMapper;

}
