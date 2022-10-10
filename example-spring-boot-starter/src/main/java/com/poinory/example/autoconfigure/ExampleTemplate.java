package com.poinory.example.autoconfigure;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 在这里打造你的模板，实现你的功能
 *
 * @author Wencong W Lv
 */
@Data
@Accessors(chain = true)
public class ExampleTemplate {
    private String username;
    private String password;
    private String ip;
    private String port;

    public void showInfo() {
        System.out.println(this);
    }
}
