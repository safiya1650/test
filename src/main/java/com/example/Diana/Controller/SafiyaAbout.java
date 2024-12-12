package com.example.Diana.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SafiyaAbout {
    @GetMapping("/about.html")
    public String mainPageG(){return "about";}

    @PostMapping("/about.html")
    public String mainPageP(String login, String password){
        System.out.println(login+" "+password);
        return "about";
    }
}
