package com.MovieDB.MovieDBProject.controler;
import com.MovieDB.MovieDBProject.dao.PersonRepo;
import com.MovieDB.MovieDBProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonControler {
    @Autowired
    private PersonRepo personRepo;

    @GetMapping("/persons")
    public String getAllPersons(@RequestParam(required = false) String name, Model model) {
        List<Person> persons;

        if (name != null && !name.isEmpty()) {
            persons = personRepo.findByPersonNameContainingIgnoreCase(name);
        } else {
            persons = personRepo.findAll();
        }

        model.addAttribute("persons", persons);
        model.addAttribute("searchName", name); // Para mostrar el nombre buscado en la vista
        return "persons-list";
    }
}
