package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 來標註主程序
 */
// springboot應用 標註在某個類上 放在多個類上也不會報錯
// 但是你port 不要衝突
@SpringBootApplication
public class HelloWorldMainApplication2 {
    public static void main(String[] args) throws Exception{
        // 勿忘args
        SpringApplication.run(HelloWorldMainApplication2.class, args);
    }
}
