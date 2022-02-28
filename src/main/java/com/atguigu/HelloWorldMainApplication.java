package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 來標註主程序
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) throws Exception{
        // 勿忘args
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
