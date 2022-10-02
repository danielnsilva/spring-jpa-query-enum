package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(
        "select p FROM Person p" +
        " where p.gender like %:searchString%" +
        " or p.name like %:searchString%"
    )
    List<Person> search(String searchString);

    // @Query(
    //     "select p FROM Person p" +
    //     " where p.name like %:searchString%" +
    //     " or p.gender like %:searchString%"
    // )
    // List<Person> search(String searchString);
    
}
