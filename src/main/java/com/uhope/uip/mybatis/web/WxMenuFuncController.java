package com.uhope.uip.mybatis.web;

import com.uhope.uip.mybatis.domain.WxMenuFunc;
import com.uhope.uip.mybatis.service.WxMenuFuncService;
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
import java.lang.Integer;

/**
 * 微信功能菜单-Controller类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Api(description = "微信功能菜单")
@RestController
@RequestMapping("/wxMenuFunc")
public class WxMenuFuncController {

    @Resource
    private WxMenuFuncService wxMenuFuncService;

    @ApiOperation(value = "新增", notes = "单表新增")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "WxMenuFunc", value = "WxMenuFunc对象", required = true, dataType = "Object")
    })
    @PostMapping("/add")
    public Result<WxMenuFunc> add(WxMenuFunc wxMenuFunc) {
        wxMenuFuncService.save(wxMenuFunc);
        return ResponseMsgUtil.success(wxMenuFunc);
    }

    @ApiOperation(value = "删除", notes = "单表删除")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "Integer")
    })
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        wxMenuFuncService.deleteById(id);
        return ResponseMsgUtil.success(null);
    }

    @ApiOperation(value = "更新", notes = "单表更新")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "WxMenuFunc", value = "WxMenuFunc对象", required = true, dataType = "Object")
    })
    @PostMapping("/update")
    public Result<WxMenuFunc> update(WxMenuFunc wxMenuFunc) {
        wxMenuFuncService.update(wxMenuFunc);
        return ResponseMsgUtil.success(wxMenuFunc);
    }

    @ApiOperation(value = "详情", notes = "单表详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "Integer")
    })
    @PostMapping("/detail")
    public Result<WxMenuFunc> detail(@RequestParam Integer id) {
        WxMenuFunc wxMenuFunc = wxMenuFuncService.findById(id);
        return ResponseMsgUtil.success(wxMenuFunc);
    }

    @ApiOperation(value = "分页", notes = "单表分页")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "size", value = "页数", required = true, dataType = "Integer")
    })
    @PostMapping("/list")
    public Result<PageInfo> list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<WxMenuFunc> list = wxMenuFuncService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResponseMsgUtil.success(pageInfo);
    }
}
