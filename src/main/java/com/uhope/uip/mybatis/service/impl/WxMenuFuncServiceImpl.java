package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxMenuFuncMapper;
import com.uhope.uip.mybatis.domain.WxMenuFunc;
import com.uhope.uip.mybatis.service.WxMenuFuncService;
import com.uhope.uip.mybatis.dto.WxMenuFuncDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.Integer;

import javax.annotation.Resource;

/**
 * 微信功能菜单-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
@Transactional
public class WxMenuFuncServiceImpl extends AbstractService<WxMenuFunc, WxMenuFuncDTO, Integer> implements WxMenuFuncService {
    @Resource
    private WxMenuFuncMapper wxMenuFuncMapper;

}
