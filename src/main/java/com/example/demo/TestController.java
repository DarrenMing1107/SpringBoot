package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/darren")
    public String ivan(Model model) {
        model.addAttribute("message", "Hello Java Spring!");
        model.addAttribute("description", "Hello Darren description!");
        return "darren";
    }
}
