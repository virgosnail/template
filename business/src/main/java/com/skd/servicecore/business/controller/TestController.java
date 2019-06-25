package com.skd.servicecore.business.controller;

import com.skd.servicecore.api.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Describe:
 * @Author: chenfan
 * @Date: 2019/6/25 13:25
 */
@Slf4j
@Api(value = "DemoService")
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class TestController implements DemoService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @RequestMapping(name = "/ping", method = RequestMethod.GET)
    @ApiOperation(value = "ping")
    public String ping() {
        ResponseEntity<String> responseEntity = restTemplate.exchange("https://www.baidu.com", HttpMethod.GET, null, String.class);
        log.error(responseEntity.getBody());
        return "DemoService pong";
    }

    @Override
    @RequestMapping(name = "/hello", method = RequestMethod.POST)
    @ApiOperation(value = "hello")
    public String hello() {
        ResponseEntity<String> responseEntity = restTemplate.exchange("https://www.baidu.com", HttpMethod.GET, null, String.class);
        log.error(responseEntity.getBody());
        return "DemoService hello";
    }
}
