package com.xxty.rbac.common.result;

import com.xxty.rbac.common.enums.ExceptionCodeEnum;

/**
 * api响应结果工具类
 */
public class ApiResultUtil {
    /**
     * 返回成功
     * @param data
     * @return
     */
    public static ApiResultVO setSuccess(Object data) {
        return new ApiResultVO(ExceptionCodeEnum.SUCCESS.code(), ExceptionCodeEnum.SUCCESS.message(), data);
    }
    /**
     * 返回成功
     * @return
     */
    public static ApiResultVO setSuccess() {
        return new ApiResultVO(ExceptionCodeEnum.SUCCESS.code(), ExceptionCodeEnum.SUCCESS.message());
    }

    /**
     * 返回失败
     * @param codeEnum
     * @return
     */
    public static ApiResultVO setFailed(ExceptionCodeEnum codeEnum) {
        return new ApiResultVO(codeEnum.code(), codeEnum.message());
    }

    /**
     * 返回失败
     * @param codeEnum
     * @param message
     * @return
     */
    public static ApiResultVO setFailed(ExceptionCodeEnum codeEnum, String message) {
        return new ApiResultVO(codeEnum.code(), codeEnum.message() + "：" + message);
    }

    /**
     * 返回失败
     * @param code
     * @param message
     * @return
     */
    public static ApiResultVO setFailed(String code, String message) {
        return new ApiResultVO(code, message);
    }
}
