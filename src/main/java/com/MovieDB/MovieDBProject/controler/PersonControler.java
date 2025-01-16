package com.MovieDB.MovieDBProject.controler;
import com.MovieDB.MovieDBProject.dao.PersonRepo;
import com.MovieDB.MovieDBProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonControler {
    @Autowired
    private PersonRepo personRepo;

    @GetMapping("/persons")
    public String getAllPersons(Model model) {

        List<Person> persons = personRepo.findAll();

        model.addAttribute("persons", persons);
        return "persons-list";
    }
}
