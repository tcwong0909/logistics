package com.tcwong.common;

/**
 * 自定义异常
 */
public class YTException extends Throwable {

    private int errorCode;

    public YTException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public YTException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
