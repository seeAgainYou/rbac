package com.xxty.rbac.service.impl;

import com.xxty.rbac.common.utils.BeanValidator;
import com.xxty.rbac.common.utils.IpUtil;
import com.xxty.rbac.common.utils.LevelUtil;
import com.xxty.rbac.common.utils.RequestHolder;
import com.xxty.rbac.entity.SysDept;
import com.xxty.rbac.exception.ParamException;
import com.xxty.rbac.mapper.SysDeptMapper;
import com.xxty.rbac.param.DeptParam;
import com.xxty.rbac.service.SysDeptService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class SysDeptServiceImpl implements SysDeptService {
    @Resource
    public SysDeptMapper sysDeptMapper;

    @Override
    public void save(DeptParam deptParam) {
        BeanValidator.check(deptParam);
//        if (checkExist(deptParam.getParentId(),deptParam.getName(),deptParam.getId())){
        if (false){
            throw new ParamException("该部门名称已经存在");
        }
        SysDept dept = SysDept.builder().name(deptParam.getName()).parentId(deptParam.getParentId())
                .seq(deptParam.getSeq()).remark(deptParam.getRemark()).build();
        dept.setLevel(LevelUtil.calculateLevel(getLevel(deptParam.getParentId()), deptParam.getParentId()));
        dept.setOperator(RequestHolder.getCurrentUser().getUsername());
        dept.setOperateIp(IpUtil.getRemoteIp(RequestHolder.getCurrentRequest()));
        dept.setOperateTime(new Date());
        sysDeptMapper.insertSelective(dept);
    }

    private String getLevel(Integer deptId) {
        SysDept dept = sysDeptMapper.selectByPrimaryKey(deptId);
        if (dept == null) {
            return null;
        }
        return dept.getLevel();
    }

    private boolean checkExist(Integer parentId, String deptName, Integer deptId) {
        return sysDeptMapper.countByNameAndParentId(parentId,deptName,deptId)>0;
    }
}
