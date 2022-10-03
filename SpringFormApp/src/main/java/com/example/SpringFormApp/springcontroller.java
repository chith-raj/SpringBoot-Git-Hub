package com.example.SpringFormApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springcontroller {

    @GetMapping("/form")

    public String form(){
        return "form";
    }


//    http://localhost:8080/processEven?
//
    @PostMapping ("processEven")
    @ResponseBody
    public boolean processEven(@RequestParam("number") int number){
//        System.out.println(number);
        return (number % 2 == 0);
    }
}
