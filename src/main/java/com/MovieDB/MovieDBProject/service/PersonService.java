package com.MovieDB.MovieDBProject.service;

import com.MovieDB.MovieDBProject.dao.PersonRepo;
import com.MovieDB.MovieDBProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class PersonService {
    @Autowired
    private PersonRepo personRepo;

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
}
