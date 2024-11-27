package com.spring.project.PennyPlan.controller;

import com.spring.project.PennyPlan.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    User user1 = new User("uscc-sdfdf-sdfsd","Kaizoku","kaizoku@penny.com","xyz");
    @GetMapping("/user")
    String user(){
        return user1.toString();
    }
}
