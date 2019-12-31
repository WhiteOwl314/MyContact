package com.fastcampus.javaallinone.project4.mycontact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //값을 다루고 있는 객체
public class Person {

    @Id
    @GeneratedValue //자동생성
    private Long id;

    private String name;
    private int age;

}
