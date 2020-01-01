package com.fastcampus.javaallinone.project4.mycontact.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity //값을 다루고 있는 객체
@Getter
@Setter
@ToString
public class Person {

    @Id
    @GeneratedValue //자동생성
    private Long id;

    private String name;

    private int age;
    private String hobby;
    private String boloodType;
    private String address;
    private LocalDate birthday;
    private String job;

    @ToString.Exclude
    private String phonNumber

    public Person() {
    }

}
