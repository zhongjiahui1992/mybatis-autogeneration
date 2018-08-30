package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxTemplateMsgMapper;
import com.uhope.uip.mybatis.domain.WxTemplateMsg;
import com.uhope.uip.mybatis.service.WxTemplateMsgService;
import com.uhope.uip.mybatis.dto.WxTemplateMsgDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * 消息模板-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
@Transactional
public class WxTemplateMsgServiceImpl extends AbstractService<WxTemplateMsg, WxTemplateMsgDTO, String> implements WxTemplateMsgService {
    @Resource
    private WxTemplateMsgMapper wxTemplateMsgMapper;

}
