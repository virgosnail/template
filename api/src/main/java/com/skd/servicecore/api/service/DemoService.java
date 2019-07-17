package com.skd.servicecore.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Describe:
 * @Author: chenfan
 * @Date: 2019/6/25 13:29
 */
@FeignClient("application.name")
public interface DemoService {

    @RequestMapping(value = "api/v1/demo/ping",method = RequestMethod.GET)
    String ping();

    @RequestMapping(value = "api/v1/demo/hello",method = RequestMethod.POST)
    String hello();

    @RequestMapping(value = "api/v1/demo/real/ping",method = RequestMethod.GET)
    String realPing();

    @RequestMapping(value = "api/v1/demo/real/hello",method = RequestMethod.POST)
    String realHello();
}
