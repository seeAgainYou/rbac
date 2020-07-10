package com.xxty.rbac.exception.exception.auth;


import com.xxty.rbac.common.comstants.CommonConstants;
import com.xxty.rbac.exception.exception.BaseException;

/**
 * Created by ace on 2017/9/12.
 */
public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
