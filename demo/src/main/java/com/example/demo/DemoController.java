package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

//     url path variable
//    http://localhost:8080/add/10/20

    @GetMapping("/add/{a}/{b}")
    @ResponseBody
    public int add(@PathVariable("a") int a , @PathVariable("b") int b ){
        return (a+b);
    }

//    http://localhost:8080/addition?a=10&b=10

    @GetMapping("/addition")
    @ResponseBody
    public int addition(@RequestParam ("a") int a,@RequestParam (value = "b", defaultValue = "20") int b){
        return (a+b);
    }


//    http://localhost:8080/
    @GetMapping("/")
    @ResponseBody
    public String home(){
        return ("Hello This Is Chithu's Application");
    }
//    http://localhost:8080/greeting
    @GetMapping("/greeting")
    @ResponseBody
    public String greeting(){
        return ("Welcome to Spring Web Application");
    }


//    http://localhost:8080/welcome
    @GetMapping("/welcome")
    public String welcome(){
        return "demo";
    }
}
