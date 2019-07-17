package com.skd.servicecore.business.common;

import lombok.Data;

/**
 * @Describe:
 * @Author: chenfan
 * @Date: 2019/6/25 14:25
 */
@Data
public class ResponseResult <D> {

    private Integer code;
    private D data;
    private String errorInfo;

}
