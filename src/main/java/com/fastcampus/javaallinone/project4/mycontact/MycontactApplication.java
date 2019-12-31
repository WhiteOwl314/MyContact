package com.fastcampus.javaallinone.project4.mycontact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MycontactApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycontactApplication.class, args);
    }

}
