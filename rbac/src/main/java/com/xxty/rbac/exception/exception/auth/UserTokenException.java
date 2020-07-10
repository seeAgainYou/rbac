package com.xxty.rbac.exception.exception.auth;

import com.xxty.rbac.common.comstants.CommonConstants;
import com.xxty.rbac.exception.exception.BaseException;

/**
 * Created by ace on 2017/9/8.
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
