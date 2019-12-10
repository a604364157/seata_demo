package com.jjx.demod;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jiangjx
 */
@EnableSwagger2
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.jjx.demod.mapper")
@SpringBootApplication(scanBasePackages = {"com.jjx"}, exclude = DataSourceAutoConfiguration.class)
public class DemoDApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDApplication.class, args);
    }

}
