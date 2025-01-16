package com.MovieDB.MovieDBProject.dao;
import com.MovieDB.MovieDBProject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person, Integer> {
    List<Person> findByPersonNameContainingIgnoreCase(String personName);

}