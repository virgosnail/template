package com.skd.servicecore.business.config;

import com.skd.servicecore.business.common.ResponseResult;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @Describe:
 * @Author: chenfan
 * @Date: 2019/6/25 15:07
 */
@Configuration
@RestControllerAdvice
public class ResponseConfig implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return null != methodParameter.getMethod() && ResponseEntity.class != methodParameter.getMethod().getReturnType();
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        ResponseResult result = new ResponseResult();
        if (null == body){
            result.setCode(200);
        } else {
            result.setCode(200);
            result.setData(body.toString());
        }
        return result;
    }
}
