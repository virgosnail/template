package com.skd.demo.business.controller;

import com.skd.demo.api.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe:
 * @Author: chenfan
 * @Date: 2019/6/25 13:25
 */
@Slf4j
@Api(value = "DemoService")
@RestController
@RequestMapping(value = "/api/v1/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class TestDemoController implements DemoService {




    @Override
    @RequestMapping(name = "/ping", method = RequestMethod.GET)
    @ApiOperation(value = "ping")
    public String ping() {
        return "service demo pong";
    }

    @Override
    @RequestMapping(name = "/hello", method = RequestMethod.POST)
    @ApiOperation(value = "hello")
    public String hello() {
        return "service demo hi";
    }

    @Override
    @RequestMapping(value = "/real/ping",method = RequestMethod.GET)
    public String realPing() {
        return "Demo demo Service pong";
    }

    @Override
    @RequestMapping(value = "/real/hello",method = RequestMethod.POST)
    public String realHello() {
        return "Demo demo Service hello";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(@RequestParam String a,@RequestParam(required = false) int b) {
        return a + b;
    }
}
