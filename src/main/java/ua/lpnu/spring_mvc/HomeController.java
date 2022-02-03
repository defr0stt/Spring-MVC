package ua.lpnu.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/greeting")
    public String sayHello(){
        return "greeting";
    }
}