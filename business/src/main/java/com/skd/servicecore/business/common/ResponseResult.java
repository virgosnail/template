package com.skd.servicecore.business.common;

import lombok.Data;

/**
 * @Describe:
 * @Author: chenfan
 * @Date: 2019/6/25 14:25
 */
@Data
public class ResponseResult {

    private Integer code;
    private Object data;
    private String errorInfo;

}
