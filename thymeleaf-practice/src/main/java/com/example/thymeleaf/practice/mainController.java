package com.example.thymeleaf.practice;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return ("hello");
    }

    @GetMapping ("/home")
    public String home(){
        return "home";
    }

    @PostMapping ("/nameresult")
    @ResponseBody
    public String result(@RequestParam ("YourName") int name, Model model){
        return "name";
    }
}
