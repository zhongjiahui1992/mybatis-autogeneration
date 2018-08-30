package com.uhope.uip.mybatis.web;

import com.uhope.uip.mybatis.domain.WxNewsArticle;
import com.uhope.uip.mybatis.service.WxNewsArticleService;
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
 * -Controller类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Api(description = "")
@RestController
@RequestMapping("/wxNewsArticle")
public class WxNewsArticleController {

    @Resource
    private WxNewsArticleService wxNewsArticleService;

    @ApiOperation(value = "新增", notes = "单表新增")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "WxNewsArticle", value = "WxNewsArticle对象", required = true, dataType = "Object")
    })
    @PostMapping("/add")
    public Result<WxNewsArticle> add(WxNewsArticle wxNewsArticle) {
        wxNewsArticleService.save(wxNewsArticle);
        return ResponseMsgUtil.success(wxNewsArticle);
    }

    @ApiOperation(value = "删除", notes = "单表删除")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "String")
    })
    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        wxNewsArticleService.deleteById(id);
        return ResponseMsgUtil.success(null);
    }

    @ApiOperation(value = "更新", notes = "单表更新")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "WxNewsArticle", value = "WxNewsArticle对象", required = true, dataType = "Object")
    })
    @PostMapping("/update")
    public Result<WxNewsArticle> update(WxNewsArticle wxNewsArticle) {
        wxNewsArticleService.update(wxNewsArticle);
        return ResponseMsgUtil.success(wxNewsArticle);
    }

    @ApiOperation(value = "详情", notes = "单表详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "String")
    })
    @PostMapping("/detail")
    public Result<WxNewsArticle> detail(@RequestParam String id) {
        WxNewsArticle wxNewsArticle = wxNewsArticleService.findById(id);
        return ResponseMsgUtil.success(wxNewsArticle);
    }

    @ApiOperation(value = "分页", notes = "单表分页")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "size", value = "页数", required = true, dataType = "Integer")
    })
    @PostMapping("/list")
    public Result<PageInfo> list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<WxNewsArticle> list = wxNewsArticleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResponseMsgUtil.success(pageInfo);
    }
}
