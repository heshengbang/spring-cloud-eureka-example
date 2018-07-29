package com.hsb.cloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by heshengbang on 2018/7/29.
 * https://github.com/heshengbang
 * www.heshengbang.men
 * email: trulyheshengbang@gmail.com
 */
//@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception e) {
        log.warn(e.getMessage());
        return "Exception Deal!";
    }

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public String handleThrowable(Throwable throwable) {
        log.warn(throwable.getMessage());
        return "Throwable Detail!";
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String handleRuntimeException(RuntimeException e) {
        log.warn(e.getMessage());
        return "RuntimeException Detail!";
    }
}
