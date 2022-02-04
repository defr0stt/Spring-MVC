package ua.lpnu.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class MyFirstController
{
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            Model model) {
        model.addAttribute("message","Hello, " + name);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam(value = "name", required = false) String name,
                              Model model){
        model.addAttribute("message","Goodbye, " + name);
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "action", required = false) String action,
                            @RequestParam(value = "var1", required = false) Integer x1,
                            @RequestParam(value = "var2", required = false) Integer x2,
                            Model model){
        String result = "NO PARAMETERS";
        if(action != null && x1 != null && x2 != null){
            if(action.equals("add")){
                result = "Addition result = " + x1 + " + " + x2 + " = " + (x1 + x2);
            } else if(action.equals("sub")){
                result = "Subtraction result = " + x1 + " - " + x2 + " = " + (x1 - x2);
            } else if(action.equals("div")){
                result = "Division result = " + x1 + " / " + x2 + " = " + String.format("%.2f",(double)x1 / x2);
            } else if(action.equals("mul")){
                result = "Multiplication result : " + x1 + " * " + x2 + " = " + (x1 * x2);
            }
        }
        model.addAttribute("result",result);
        return "first/calculator";
    }
}