package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;

/**
 * FileName: Greeting
 *
 * @Author: bi
 * Date:     2019/5/27 16:49
 * Description: greeting
 */
@Getter
@Setter
public class Greeting {

    private String content;

    public Greeting(String content) {
        this.content = content;
    }
}
