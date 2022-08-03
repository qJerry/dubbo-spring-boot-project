package com.github.qjerry;

import java.io.Serializable;

/**
 * @author Jerry
 * @date 2022/8/3
 */
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = -9016028281134201931L;

    public static ApiResponse<?> SUCCESS = new ApiResponse<>("SUCCESS", "SUCCESS", null);

    /**
     * 响应码
     */
    protected String code = "SUCCESS";
    /**
     * 响应信息
     */
    protected String msg = "SUCCESS";

    /**
     * 响应数据
     */
    protected T data;

    public ApiResponse() {
    }

    public ApiResponse(T data) {
        this.data = data;
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<T>("SUCCESS", "SUCCESS", data);
    }

    public static <T> ApiResponse<T> fail(String preCode, String code, String message) {
        return new ApiResponse<T>(preCode + code, message, null);
    }

    public static <T> ApiResponse<T> success() {
        return success(null);
    }

    public ApiResponse(String code, String msg, T data) {
        this.msg = msg;
        this.data = data;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
