package com.xxty.rbac.controller;

import com.xxty.rbac.config.ApiVersion;
import com.xxty.rbac.config.ApiVersionConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@Api("test")
public class TestController {

    @GetMapping("/say")
    @ApiOperation(value = "test")
    public String say(){
        return "hello";
    }
    @ApiOperation("查询")
    @GetMapping("/hello")
    public String getDemo(){
        return "hello";
    }
    @ApiOperation("shanchu")
    @ApiVersion(ApiVersionConstant.VERSION_2_7_3)
    @PutMapping("/hell")
    public String getDem(){
        return "hello";
    }
    @ApiOperation("xiu改")
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @PostMapping("/hel")
    @ApiVersion({ApiVersionConstant.VERSION_2_7_3, ApiVersionConstant.VERSION_2_8})
    public String getDe(String id){
        return "hello";
    }
}
