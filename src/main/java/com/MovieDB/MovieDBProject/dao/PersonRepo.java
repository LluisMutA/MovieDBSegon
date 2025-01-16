package com.MovieDB.MovieDBProject.dao;
import com.MovieDB.MovieDBProject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}