package com.choincnp.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "Index";
    }

    @GetMapping("/login")
    public String login(){
        return "Login";
    }

    @GetMapping("/home")
    public String home(){
        return "Home";
    }
}
