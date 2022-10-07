package com.example.SpringFormApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    public String processEven(@RequestParam("number") int number, Model model){
        model.addAttribute("number",number);
        if (number % 2 ==0){
            model.addAttribute("result","Even");
        }
        else {
            model.addAttribute("result","Not Even");
        }
        return "result";
    }
}
