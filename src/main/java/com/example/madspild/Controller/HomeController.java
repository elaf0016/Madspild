package com.example.madspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "madspild";
    }

    @GetMapping("/erhverv")
    public String erhverv() {
        return "erhverv";
    }
}