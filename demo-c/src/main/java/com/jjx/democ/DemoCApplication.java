package com.jjx.democ;

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
@MapperScan("com.jjx.democ.mapper")
@SpringBootApplication(scanBasePackages = {"com.jjx"}, exclude = DataSourceAutoConfiguration.class)
public class DemoCApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCApplication.class, args);
    }

}
