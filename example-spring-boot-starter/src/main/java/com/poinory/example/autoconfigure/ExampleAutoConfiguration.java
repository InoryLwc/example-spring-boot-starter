package com.poinory.example.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 自动装配
 *
 * @author Wencong W Lv
 */
@EnableConfigurationProperties(ExampleProperties.class)
@Configuration
public class ExampleAutoConfiguration {

    @Resource
    private ExampleProperties exampleProperties;

    /**
     * 创建并注入 Template
     *
     * @return ExampleTemplate
     */
    @Bean
    public ExampleTemplate exampleTemplate() {
        return new ExampleTemplate()
                .setUsername(exampleProperties.getUsername())
                .setPassword(exampleProperties.getPassword())
                .setIp(exampleProperties.getIp())
                .setPort(exampleProperties.getPort());
    }

}
