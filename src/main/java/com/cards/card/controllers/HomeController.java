package com.cards.card.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/card")
    public String home(){
        return "cards/show";
    }

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

}
