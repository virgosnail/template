package com.skd.servicecore.business.common.codec;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @Description:
 * @Author: virgosnail
 * @Date: 2019/7/14 18:10
 */
@Slf4j
@Configuration
public class FeignDecode implements Decoder {

    /**
     * Decodes an http response into an object corresponding to its
     * {@link Method#getGenericReturnType() generic return type}. If you need to
     * wrap exceptions, please do so via {@link DecodeException}.
     *
     * @param response the response to decode
     * @param type     {@link Method#getGenericReturnType() generic return type} of the
     *                 method corresponding to this {@code response}.
     * @return instance of {@code type}
     * @throws IOException     will be propagated safely to the caller.
     * @throws DecodeException when decoding failed due to a checked exception besides IOException.
     * @throws FeignException  when decoding succeeds, but conveys the operation failed.
     */
    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {


        return null;
    }
}
