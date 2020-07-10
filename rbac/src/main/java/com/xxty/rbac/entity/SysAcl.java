package com.xxty.rbac.entity;

import java.io.Serializable;
import java.util.Date;

public class SysAcl implements Serializable {
    /**
     * 权限id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 权限码
     *
     * @mbggenerated
     */
    private String code;

    /**
     * 权限名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 权限所在的权限模块id
     *
     * @mbggenerated
     */
    private Integer aclModuleId;

    /**
     * 请求的url, 可以填正则表达式
     *
     * @mbggenerated
     */
    private String url;

    /**
     * 类型，1：菜单，2：按钮，3：其他
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 状态，1：正常，0：冻结
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 权限在当前模块下的顺序，由小到大
     *
     * @mbggenerated
     */
    private Integer seq;

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
     * 最后一个更新者的ip地址
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAclModuleId() {
        return aclModuleId;
    }

    public void setAclModuleId(Integer aclModuleId) {
        this.aclModuleId = aclModuleId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
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
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", aclModuleId=").append(aclModuleId);
        sb.append(", url=").append(url);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", seq=").append(seq);
        sb.append(", remark=").append(remark);
        sb.append(", operator=").append(operator);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateIp=").append(operateIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}