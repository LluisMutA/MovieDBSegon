package com.MovieDB.MovieDBProject.service;

import com.MovieDB.MovieDBProject.dao.PersonRepo;
import com.MovieDB.MovieDBProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    // Obtener todos los actores
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    // Buscar actores por nombre
    public List<Person> getPersonsByName(String name) {
        return personRepo.findByPersonNameContainingIgnoreCase(name);
    }
}
