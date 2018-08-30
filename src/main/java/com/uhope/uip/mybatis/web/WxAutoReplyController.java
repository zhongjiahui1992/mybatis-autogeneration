package com.uhope.uip.mybatis.web;

import com.uhope.uip.mybatis.domain.WxAutoReply;
import com.uhope.uip.mybatis.service.WxAutoReplyService;
import com.uhope.uip.base.dto.Result;
import com.uhope.uip.base.util.ResponseMsgUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.lang.String;

/**
 * 自动回复-Controller类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Api(description = "自动回复")
@RestController
@RequestMapping("/wxAutoReply")
public class WxAutoReplyController {

    @Resource
    private WxAutoReplyService wxAutoReplyService;

    @ApiOperation(value = "新增", notes = "单表新增")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "WxAutoReply", value = "WxAutoReply对象", required = true, dataType = "Object")
    })
    @PostMapping("/add")
    public Result<WxAutoReply> add(WxAutoReply wxAutoReply) {
        wxAutoReplyService.save(wxAutoReply);
        return ResponseMsgUtil.success(wxAutoReply);
    }

    @ApiOperation(value = "删除", notes = "单表删除")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "String")
    })
    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        wxAutoReplyService.deleteById(id);
        return ResponseMsgUtil.success(null);
    }

    @ApiOperation(value = "更新", notes = "单表更新")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "WxAutoReply", value = "WxAutoReply对象", required = true, dataType = "Object")
    })
    @PostMapping("/update")
    public Result<WxAutoReply> update(WxAutoReply wxAutoReply) {
        wxAutoReplyService.update(wxAutoReply);
        return ResponseMsgUtil.success(wxAutoReply);
    }

    @ApiOperation(value = "详情", notes = "单表详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "String")
    })
    @PostMapping("/detail")
    public Result<WxAutoReply> detail(@RequestParam String id) {
        WxAutoReply wxAutoReply = wxAutoReplyService.findById(id);
        return ResponseMsgUtil.success(wxAutoReply);
    }

    @ApiOperation(value = "分页", notes = "单表分页")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "size", value = "页数", required = true, dataType = "Integer")
    })
    @PostMapping("/list")
    public Result<PageInfo> list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<WxAutoReply> list = wxAutoReplyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResponseMsgUtil.success(pageInfo);
    }
}
