package com.xxty.rbac.common.result;

import lombok.Data;

/**
 * api响应统一result对象
 * 所有响应结果使用该result对象进行封装
 */
@Data
public class ApiResultVO {
    String code;
    String message;
    Object data;

    public ApiResultVO(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResultVO(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
