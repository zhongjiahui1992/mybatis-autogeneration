package com.uhope.uip.mybatis.service.impl;

import com.uhope.uip.mybatis.mapper.WxAutoReplyMapper;
import com.uhope.uip.mybatis.domain.WxAutoReply;
import com.uhope.uip.mybatis.service.WxAutoReplyService;
import com.uhope.uip.mybatis.dto.WxAutoReplyDTO;
import com.uhope.uip.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.String;

import javax.annotation.Resource;

/**
 * 自动回复-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
@Transactional
public class WxAutoReplyServiceImpl extends AbstractService<WxAutoReply, WxAutoReplyDTO, String> implements WxAutoReplyService {
    @Resource
    private WxAutoReplyMapper wxAutoReplyMapper;

}
