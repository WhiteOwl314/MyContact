package com.fastcampus.javaallinone.project4.mycontact.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloWorldControllerTest {

    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    void helloWorld(){ //디폴트 접근제어자 : 동일한 패키지에서만
//        System.out.println("test");

        System.out.println(helloWorldController.HelloWorld());
    }
}