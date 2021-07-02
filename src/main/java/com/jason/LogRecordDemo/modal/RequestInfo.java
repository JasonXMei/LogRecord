package com.jason.LogRecordDemo.modal;

import lombok.Data;

/**
 * @Author Jason
 * @Date 2021-07-02
 */
@Data
public class RequestInfo {

    private String ip;
    private String url;
    private String httpMethod;
    private String classMethod;
    private Object requestParams;
    private Object result;
    private Long timeCost;

}
