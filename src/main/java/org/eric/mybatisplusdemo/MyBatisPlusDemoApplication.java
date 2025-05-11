package org.eric.mybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.eric.mybatisplusdemo.mapper")

public class MyBatisPlusDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusDemoApplication.class, args);
    }

}

