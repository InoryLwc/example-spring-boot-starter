package com.poinory.example.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 读取 application 配置文件
 *
 * @author Wencong W Lv
 */

@ConfigurationProperties(prefix = ExampleProperties.PREFIX)
@Data
public class ExampleProperties {
    public static final String PREFIX = "example-demo";
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * ip 地址
     */
    private String ip;
    /**
     * 端口号
     */
    private String port;
}
