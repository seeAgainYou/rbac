package com.xxty.rbac.exception;

import com.xxty.rbac.common.enums.ExceptionCodeEnum;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("com.xxty.rbac.controller")
public class GeneralControlException extends RuntimeException {
    private ExceptionCodeEnum code = ExceptionCodeEnum.UNKNOWN_EXCEPTION;

    /**
     * 构建一个<code>GeneralControlException.java</code>
     */
    public GeneralControlException() {
        super("");
    }

    /**
     * 构建一个<code>GeneralControlException.java</code>
     * @param code
     */
    public GeneralControlException(ExceptionCodeEnum code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * 构建一个<code>GeneralControlException.java</code>
     * @param code
     */
    public GeneralControlException(ExceptionCodeEnum code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    /**
     * 构建一个<code>GeneralControlException.java</code>
     * @param code
     */
    public GeneralControlException(ExceptionCodeEnum code, Throwable cause) {
        super(code.code(), cause);
        this.code = code;
    }

    public GeneralControlException(ExceptionCodeEnum code) {
        super(code.code());
        this.code = code;
    }

    /**
     * @return Returns the code
     */
    public ExceptionCodeEnum getCode() {
        return code;
    }

    /**
     * @param code
     * The code to set.
     */
    public void setCode(ExceptionCodeEnum code) {
        this.code = code;
    }
}
