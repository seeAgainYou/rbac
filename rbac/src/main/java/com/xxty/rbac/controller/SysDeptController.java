package com.xxty.rbac.controller;

import com.xxty.rbac.common.result.ApiResultUtil;
import com.xxty.rbac.common.result.ApiResultVO;
import com.xxty.rbac.param.DeptParam;
import com.xxty.rbac.service.SysDeptService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dept")
@Api(value = "部门")
public class SysDeptController {
    @Autowired
    public SysDeptService sysDeptService;

    @PostMapping("/save.json")
    public ApiResultVO saveDept(DeptParam deptParam){
        sysDeptService.save(deptParam);
        return ApiResultUtil.setSuccess();
    }

}
