package com.fastcampus.javaallinone.project4.mycontact.repository;

import com.fastcampus.javaallinone.project4.mycontact.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void crud(){

        Person person = new Person();
        person.setName("martin");
        person.setAge(10);

        personRepository.save(person);

        System.out.println(personRepository.findAll());

        List<Person> peaple =personRepository.findAll();

        assertThat(peaple.size()).isEqualTo(1);
        assertThat(peaple.get(0).getName()).isEqualTo("martin");
        assertThat(peaple.get(0).getAge()).isEqualTo(10);
    }
}