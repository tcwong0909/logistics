package com.tcwong.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler  {

    @ExceptionHandler(YTException.class)
    @ResponseBody
    public WebResponse jsonHandler(YTException e){
        e.printStackTrace();
        LogUtil.error(e);
        return new WebResponse(e.getErrorCode(),e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public WebResponse exceptionHandler(Exception e){
        e.printStackTrace();
        LogUtil.error(e);
        return new WebResponse(-1,e.getMessage());
    }
}
