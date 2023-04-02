package com.example.relationproject.repository;

import com.example.relationproject.domain.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void create(){
        Person person = Person.builder()
                .age(10)
                .name("sera")
                .bloodType("A")
                .build();
        Person newPerson = personRepository.save(person);
        System.out.println(newPerson);

        List<Person> people = personRepository.findAll();
        assertThat(people.size()).isEqualTo(1);
        assertThat(people.get(0).getName()).isEqualTo("sera");
        assertThat(people.get(0).getAge()).isEqualTo(10);
        assertThat(people.get(0).getBloodType()).isEqualTo("A");
        
    }
    @Test
    void read(){


    }
    @Test
    void update(){

    }
    @Test
    void delete(){

    }

}