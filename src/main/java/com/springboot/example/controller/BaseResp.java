package com.springboot.example.controller;

/**
 * Created by chuangyang
 * Time : 18:54
 * Date: 2017/3/17.
 */
public class BaseResp<T> {
    private Long errorCode;
    private String errorMsg;
    private T data;

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
