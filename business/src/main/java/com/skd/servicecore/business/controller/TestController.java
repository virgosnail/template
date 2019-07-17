package com.skd.servicecore.business.controller;

import com.skd.servicecore.api.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe:
 * @Author: chenfan
 * @Date: 2019/6/25 13:25
 */
@Slf4j
@Api(value = "DemoService")
@RestController
@RequestMapping(value = "api/v1/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class TestController implements DemoService {

    @Override
    @RequestMapping(name = "/ping", method = RequestMethod.GET)
    @ApiOperation(value = "ping")
    public String ping() {
        log.info("invoke ping()");
        return "DemoService pong";
    }

    @Override
    @RequestMapping(name = "/hello", method = RequestMethod.POST)
    @ApiOperation(value = "hello")
    public String hello() {
        log.info("invoke hello()");
        return "DemoService hello";
    }

    @Override
    @RequestMapping(name = "/real/ping", method = RequestMethod.GET)
    @ApiOperation(value = "realPing")
    public String realPing() {
        log.info("invoke realPing()");
        return "DemoService realPing";
    }

    @Override
    @RequestMapping(name = "/real/hello", method = RequestMethod.POST)
    @ApiOperation(value = "realHello")
    public String realHello() {
        log.info("invoke realHello()");
        return "DemoService realHello";
    }

}
