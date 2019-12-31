package com.fastcampus.javaallinone.project4.mycontact;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //dataSource 설정을 설정해주지 않아 발생한 오류 해결
class MycontactApplicationTests {

    @Test
    void contextLoads() {
    }

}
