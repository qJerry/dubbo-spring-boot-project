package com.github.qjerry;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jerry
 * @date 2022/8/3
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.github.qjerry"})
public class ProviderApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
