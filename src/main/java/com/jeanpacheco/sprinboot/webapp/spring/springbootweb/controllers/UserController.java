package com.jeanpacheco.sprinboot.webapp.spring.springbootweb.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.jeanpacheco.sprinboot.webapp.spring.springbootweb.model.User;

@Controller
public class UserController {
    
    @GetMapping("/details") 
    public String details (Model modelo) {     

        User usuario = new User("Jean", "Pacheco");
        modelo.addAttribute("usuario", usuario);
        modelo.addAttribute("titulo", "Hola mundo CERTUS");




        return "details";
    }

}
