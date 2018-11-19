package com.example.demo.services;

import com.example.demo.entities.Person;
//import com.example.demo.entities.QPerson;
//import com.example.demo.entities.QPerson;
import com.example.demo.entities.QPerson;
import com.example.demo.repositories.IPersonRepository;
////import com.mysema.query.BooleanBuilder;
////import com.mysema.query.jpa.impl.JPAQuery;
//import com.mysema.query.BooleanBuilder;
//import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private IPersonRepository personRepository;

    @Autowired
    EntityManager em;

    public Optional<Person> findPersonById(int id){
        return this.personRepository.findById(id);
    }

    public List<Person> findByAge(int age, Optional<String> gender){

        QPerson person = QPerson.person;
        JPAQuery jpaQuery = new JPAQuery(em);
        BooleanBuilder booleanBuilder = new BooleanBuilder().and(person.age.goe(age));

        if(gender.isPresent()){
            booleanBuilder = booleanBuilder.and(person.gender.eq(gender.get()));
        }

      return  jpaQuery.from(person).where(booleanBuilder).list(person);

//        return this.personRepository.findByage(age);
    }



//    public List<Person> findPersonBasedOnAge(int age, Optional<String> gender){
//        QPerson person = QPerson.person;
//        BooleanBuilder booleanBuilder = new BooleanBuilder();
//        booleanBuilder = booleanBuilder.and(person.age.goe(age));
//
//        if(gender.isPresent()){
//            booleanBuilder = booleanBuilder.and(person.gender.eq(gender.get()));
//        }
//        JPAQuery jpaQuery = new JPAQuery(em);
//        List<Person> people =  jpaQuery.from(person).where(booleanBuilder)
//                .list(person);
//        return people;
//    }

}
