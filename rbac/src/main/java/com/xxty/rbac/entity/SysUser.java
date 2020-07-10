package com.xxty.rbac.entity;

import lombok.Builder;

import java.io.Serializable;
import java.util.Date;

@Builder
public class SysUser implements Serializable {
    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 用户名称
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 手机号
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * 邮箱
     *
     * @mbggenerated
     */
    private String mail;

    /**
     * 加密后的密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 用户所在部门的id
     *
     * @mbggenerated
     */
    private Integer deptId;

    /**
     * 状态，1：正常，0：冻结状态，2：删除
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 操作者
     *
     * @mbggenerated
     */
    private String operator;

    /**
     * 最后一次更新时间
     *
     * @mbggenerated
     */
    private Date operateTime;

    /**
     * 最后一次更新者的ip地址
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", username=").append(username);
        sb.append(", telephone=").append(telephone);
        sb.append(", mail=").append(mail);
        sb.append(", password=").append(password);
        sb.append(", deptId=").append(deptId);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", operator=").append(operator);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateIp=").append(operateIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}