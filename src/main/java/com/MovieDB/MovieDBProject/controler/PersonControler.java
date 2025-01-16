package com.MovieDB.MovieDBProject.controler;

import com.MovieDB.MovieDBProject.model.Person;
import com.MovieDB.MovieDBProject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonControler {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public String getAllPersons(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name != null && !name.isEmpty()) {
            List<Person> persons = personService.getPersonsByName(name);
            model.addAttribute("persons", persons);
        }


        model.addAttribute("searchPerformed", name != null && !name.isEmpty());
        return "persons-list";
    }
}
