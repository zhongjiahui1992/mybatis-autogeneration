package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.SmUserMapper;
import com.uhope.uip.mybatis.domain.SmUser;
import com.uhope.uip.mybatis.service.SmUserService;
import com.uhope.uip.mybatis.dto.SmUserDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * -ServiceImpl接口实现类
 * @author jiangjialiang on 2018/01/03
 * @version 3.0.0
 */
@Service
@Transactional
public class SmUserServiceImpl extends AbstractService<SmUser, SmUserDTO, String> implements SmUserService {
    @Resource
    private SmUserMapper smUserMapper;

}
