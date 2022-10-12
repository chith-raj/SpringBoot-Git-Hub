package com.example.SpringAppWithThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class appcontroller {
    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return ("hello");
    }

    @GetMapping ("/demo")
    public String demo(Model model){
        model.addAttribute("temp", "HEllo");
        return "demo";
    }

}
