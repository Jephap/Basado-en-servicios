package com.jeanpacheco.sprinboot.webapp.spring.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.jeanpacheco.sprinboot.webapp.spring.springbootweb.model.User;


@RestController
@RequestMapping("/api") //end point base o ruta base
public class UserRestController {

    @GetMapping("/details") //endpoint
    
    public Map<String, Object> details () {    

        User usuario = new User("Jean", "Pacheco");
        
        Map<String, Object> body = new HashMap();

        body.put("titulo", "Hola mundo CERTUS");
        body.put("usuario", usuario);

        return body;
    }

}
