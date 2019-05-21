package com.tcwong.common;

/**
 * 通用返回对象
 * @param <T>
 */
public class WebResponse<T> {

    private long code;

    private String message;

    private T data;

    protected WebResponse() {
    }

    public WebResponse(long code, String message) {
        this.code = code;
        this.message = message;
    }

    protected WebResponse(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> success (T data){
        return  new WebResponse<T>( ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    /**
     * 成功返回结果
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> success (T data,String message){
        return  new WebResponse<T>( ResultCode.SUCCESS.getCode(),message,data);
    }

    /**
     * 失败返回结果
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> failed (IErrorCode errorCode){
        return new WebResponse<T>( errorCode.getCode(),errorCode.getMessage(),null);
    }

    /**
     * 失败返回结果
     * @param message
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> failed (String message){
        return new WebResponse<T>( ResultCode.FAILED.getCode(),message,null);
    }

    /**
     * 失败返回结果
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> failed(){
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> validateFailed(){
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> validateFailed(String message){
        return new WebResponse<T>(ResultCode.VALIDATE_FAILED.getCode(),message,null);
    }

    /**
     * 未登录返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> unauthorized(T data){
        return new WebResponse<T>(ResultCode.UNAUTHORIZED.getCode(),ResultCode.UNAUTHORIZED.getMessage(),data);
    }

    /**
     * 未授权返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> WebResponse<T> forbidden(T data){
        return new WebResponse<T>(ResultCode.FORBIDDEN.getCode(),ResultCode.FORBIDDEN.getMessage(),data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
