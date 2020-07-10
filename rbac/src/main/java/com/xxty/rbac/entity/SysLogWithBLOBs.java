package com.xxty.rbac.entity;

import java.io.Serializable;

public class SysLogWithBLOBs extends SysLog implements Serializable {
    /**
     * 旧值
     *
     * @mbggenerated
     */
    private String oldValue;

    /**
     * 新值
     *
     * @mbggenerated
     */
    private String newValue;

    private static final long serialVersionUID = 1L;

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue == null ? null : oldValue.trim();
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue == null ? null : newValue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oldValue=").append(oldValue);
        sb.append(", newValue=").append(newValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}