package com.project.springbootstudy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String home() {
        return "index";
    }

    @GetMapping("/hello/{name}/{message}")
    public String hello(@PathVariable(name="name") String name
            , @PathVariable(name="message") String message
            , Model model) {

        model.addAttribute("name" , name);
        model.addAttribute("message" , message);

        return "hello";
    }
}