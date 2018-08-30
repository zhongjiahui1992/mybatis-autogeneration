package com.uhope.uip.mybatis.web;

import com.uhope.uip.mybatis.domain.SmUser;
import com.uhope.uip.mybatis.service.SmUserService;
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
 * @author jiangjialiang on 2018/01/03
 * @version 3.0.0
 */
@Api(description = "")
@RestController
@RequestMapping("/smUser")
public class SmUserController {
    @Resource
    private SmUserService smUserService;

    @ApiOperation(value = "新增", notes = "单表新增")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "SmUser", value = "SmUser对象", required = true, dataType = "Object")
    })
    @PostMapping("/add")
    public Result<SmUser> add(SmUser smUser) {
        smUserService.save(smUser);
        return ResponseMsgUtil.success(smUser);
    }

    @ApiOperation(value = "删除", notes = "单表删除")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "String")
    })
    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        smUserService.deleteById(id);
        return ResponseMsgUtil.success(null);
    }

    @ApiOperation(value = "更新", notes = "单表更新")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "SmUser", value = "SmUser对象", required = true, dataType = "Object")
    })
    @PostMapping("/update")
    public Result<SmUser> update(SmUser smUser) {
        smUserService.update(smUser);
        return ResponseMsgUtil.success(smUser);
    }

    @ApiOperation(value = "详情", notes = "单表详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "String")
    })
    @PostMapping("/detail")
    public Result<SmUser> detail(@RequestParam String id) {
        SmUser smUser = smUserService.findById(id);
        return ResponseMsgUtil.success(smUser);
    }

    @ApiOperation(value = "分页", notes = "单表分页")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "size", value = "页数", required = true, dataType = "Integer")
    })
    @PostMapping("/list")
    public Result<PageInfo> list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SmUser> list = smUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResponseMsgUtil.success(pageInfo);
    }
}
