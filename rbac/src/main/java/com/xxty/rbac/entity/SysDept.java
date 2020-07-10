package com.xxty.rbac.entity;

import java.io.Serializable;
import java.util.Date;

public class SysDept implements Serializable {
    /**
     * 部门id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 部门名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 上级部门id
     *
     * @mbggenerated
     */
    private Integer parentId;

    /**
     * 部门层级
     *
     * @mbggenerated
     */
    private String level;

    /**
     * 部门在当前层级下的顺序，由小到大
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
     * 最后一次操作时间
     *
     * @mbggenerated
     */
    private Date operateTime;

    /**
     * 最后一次更新操作者的ip地址
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
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
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", level=").append(level);
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