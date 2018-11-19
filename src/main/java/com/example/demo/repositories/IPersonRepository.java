package com.example.demo.repositories;

import com.example.demo.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by localadmin on 29/05/18.
 */
public interface IPersonRepository extends CrudRepository<Person,Integer>{

    String sql1="SELECT * FROM Persons WHERE age >=:age";
    @Query(value = sql1, nativeQuery = true)
    public List<Person> findByage(@Param("age") int age);
}
