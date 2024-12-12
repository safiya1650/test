package com.example.Diana.Controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SafiyaLogin {

    //@Autowired
    //MainRepo mainRepo;


    @GetMapping("/login.html")
    public String mainPageG(){return "login";
    }

    @PostMapping("/login.html")
    public String mainPageP(String login, String password){
        System.out.println(login+" "+password);
        //mainRepo.save(new MainModel(login,password));
        return "login";
    }
}
