package com.example.demo.controllers;



import com.example.demo.entities.Person;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sample(){
        return "hello........";
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Person> findPersonByAge(@RequestParam(value = "age") int age ,
                                        @RequestParam(value = "gender") Optional<String> gender){
        return this.personService.findByAge(age,gender);
    }


//    @RequestMapping(value = "/age/{age}", method = RequestMethod.GET)
//    public List<Person> findPersonByAge(@PathVariable int age, @RequestParam(value="gender") Optional<String> gender ){
//       return this.personService.findPersonBasedOnAge(age, gender);
//    }

}
