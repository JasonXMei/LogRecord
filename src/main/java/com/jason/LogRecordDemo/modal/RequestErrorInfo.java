package com.jason.LogRecordDemo.modal;

import lombok.Data;

/**
 * @Author Jason
 * @Date 2021-07-02
 */
@Data
public class RequestErrorInfo {

    private String ip;
    private String url;
    private String httpMethod;
    private String classMethod;
    private Object requestParams;
    private RuntimeException exception;

}
