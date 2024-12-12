package com.example.Diana.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SafiyaGallery {
    @GetMapping("/gallery.html")
    public String mainPageG(){
        return "gallery";}
    @PostMapping("/gallery.html")
    public String mainPageP() {
        System.out.println();
        return "gallery";
    }
}