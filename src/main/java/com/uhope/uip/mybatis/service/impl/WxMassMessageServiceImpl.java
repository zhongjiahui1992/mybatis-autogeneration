package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxMassMessageMapper;
import com.uhope.uip.mybatis.domain.WxMassMessage;
import com.uhope.uip.mybatis.service.WxMassMessageService;
import com.uhope.uip.mybatis.dto.WxMassMessageDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * 群发消息记录-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
@Transactional
public class WxMassMessageServiceImpl extends AbstractService<WxMassMessage, WxMassMessageDTO, String> implements WxMassMessageService {
    @Resource
    private WxMassMessageMapper wxMassMessageMapper;

}
