package com.xxty.rbac.entity;

import java.io.Serializable;
import java.util.Date;

public class SysRoleAcl implements Serializable {
    private Integer id;

    /**
     * 角色id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * 权限id
     *
     * @mbggenerated
     */
    private Integer aclId;

    /**
     * 操作者
     *
     * @mbggenerated
     */
    private String operator;

    /**
     * 最后一次更新的时间
     *
     * @mbggenerated
     */
    private Date operateTime;

    /**
     * 最后一次更新者的ip
     *
     * @mbggenerated
     */
    private String operateIp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAclId() {
        return aclId;
    }

    public void setAclId(Integer aclId) {
        this.aclId = aclId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", aclId=").append(aclId);
        sb.append(", operator=").append(operator);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateIp=").append(operateIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}