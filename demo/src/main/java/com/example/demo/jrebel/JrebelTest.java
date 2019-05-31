package com.example.demo.jrebel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: JrebelTest
 *
 * @Author: bi
 * Date:     2019/5/27 14:18
 * Description: 测试
 */
@RestController
@RequestMapping("/JrebelTest")
public class JrebelTest {

    @RequestMapping("/hello")
    public String hello(){
        return "helloworld";
    }
}
