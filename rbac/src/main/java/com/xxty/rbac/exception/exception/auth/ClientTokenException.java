package com.xxty.rbac.exception.exception.auth;


import com.xxty.rbac.common.comstants.CommonConstants;
import com.xxty.rbac.exception.exception.BaseException;

/**
 * Created by ace on 2017/9/10.
 */
public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
