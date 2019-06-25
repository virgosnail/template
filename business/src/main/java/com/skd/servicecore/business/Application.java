package com.skd.servicecore.business;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Package com.demo.one.business
 * Company streamax.com
 * Project demo-one
 * Description
 * Created on 2018-12-24 23:12
 *
 * @author Mitol
 * @version 1.0.0
 */
@MapperScan("com.skd.servicecore.business.dao")
//@EnableFeignClients(basePackageClasses = {DemoTwoService.class}) FIXME 引入其他服务的接口定义
@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("service start success");
    }
}