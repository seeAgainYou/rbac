package com.xxty.rbac.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
@ResponseBody
public class ControllerException {
    private Logger logger = LoggerFactory.getLogger(ControllerException.class);

//    @ExceptionHandler(ClientTokenException.class)
//    public BaseResponse clientTokenExceptionHandler(HttpServletResponse response, ClientTokenException ex) {
//        response.setStatus(403);
//        logger.error(ex.getMessage(),ex);
//        return new BaseResponse(ex.getStatus(), ex.getMessage());
//    }
//
//    @ExceptionHandler(UserTokenException.class)
//    public BaseResponse userTokenExceptionHandler(HttpServletResponse response, UserTokenException ex) {
//        response.setStatus(200);
//        logger.error(ex.getMessage(),ex);
//        return new BaseResponse(ex.getStatus(), ex.getMessage());
//    }
//
//    @ExceptionHandler(UserInvalidException.class)
//    public BaseResponse userInvalidExceptionHandler(HttpServletResponse response, UserInvalidException ex) {
//        response.setStatus(200);
//        logger.error(ex.getMessage(),ex);
//        return new BaseResponse(ex.getStatus(), ex.getMessage());
//    }
//
//    @ExceptionHandler(BaseException.class)
//    public BaseResponse baseExceptionHandler(HttpServletResponse response, BaseException ex) {
//        logger.error(ex.getMessage(),ex);
//        response.setStatus(500);
//        return new BaseResponse(ex.getStatus(), ex.getMessage());
//    }

//    @ExceptionHandler(Exception.class)
//    public BaseResponse otherExceptionHandler(HttpServletResponse response, Exception ex) {
//        response.setStatus(500);
//        logger.error(ex.getMessage(),ex);
//        return new BaseResponse(CommonConstants.EX_OTHER_CODE, ex.getMessage());
//    }
}
