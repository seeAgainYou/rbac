package com.xxty.rbac.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum ExceptionCodeEnum {
    SUCCESS("EPP00_0000", "成功"),

    CHECK_FAIL("EPP00_0001", "校验失败"),

    PARAM_ERROR("EPP00_0002", "参数错误"),

    EXECUTE_FAIL("EPP00_0003", "执行失败"),

    UNKNOWN_EXCEPTION("EPP00_9999", "未知系统异常");

    String code;
    String message;
     private   ExceptionCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return Returns the code.
     */
    public String code() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String message() {
        return message;
    }
    /**
     * 获取全部枚举
     *
     * @return List<ExceptionCodeEnum>
     */
    public List<ExceptionCodeEnum> getAllEnum() {
        List<ExceptionCodeEnum> list = new ArrayList<>();
        for (ExceptionCodeEnum _enum : values()) {
            list.add(_enum);
        }
        return list;
    }

    /**
     * 获取全部枚举值
     *
     * @return List<String>
     */
    public List<String> getAllEnumCode() {
        List<String> list = new ArrayList<>();
        for (ExceptionCodeEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
}
