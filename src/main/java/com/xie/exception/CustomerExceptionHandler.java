package com.xie.exception;

import com.xie.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CustomerExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(CustomerExceptionHandler.class);

    @ExceptionHandler
    Object handleException(Exception e,HttpServletRequest request) {
        logger.error("url {}, msg {}",request.getRequestURL(), e.getMessage());
        return Result.build(Result.ERRO_CODE,e.getMessage());
    }
}
