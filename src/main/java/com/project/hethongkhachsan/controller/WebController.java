package com.project.hethongkhachsan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	 
    @GetMapping("/admin")
    public String adminPage() {
        return "admin/index";
    }
    
    @GetMapping("/")
    public String homePage() {	
        return "home/index";
    }
}
