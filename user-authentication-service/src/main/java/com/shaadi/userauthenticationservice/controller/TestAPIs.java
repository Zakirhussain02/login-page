package com.shaadi.userauthenticationservice.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("api/test")
public class TestAPIs {
    @GetMapping("/userDTO") //rest end point can be accessed only with jwt token
//    @PreAuthorize("authenticated")
    public String userAccess() {
        return "Authenticated Contents!";
    }//just a message
}

