package com.xxty.rbac.entity;

import java.util.Date;

public class SysLogWithBLOBs extends SysLog {
    private String oldValue;

    private String newValue;

    SysLogWithBLOBs(Integer id, Integer type, Integer targetId, String operator, Date operateTime, String operateIp, Integer status) {
        super(id, type, targetId, operator, operateTime, operateIp, status);
    }

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
}