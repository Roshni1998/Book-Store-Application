package com.bridgelabz.bookstoreapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author ROSHNI MALI
 * @version 0.0.1-SNAPSHOT
 * @since 18 September 2021
 * */

@RestController
@RequestMapping("/hello")
public class UserController {

    @GetMapping("/say")
    public String sayHello() {
        return "Hello Swagger";
    }

}
