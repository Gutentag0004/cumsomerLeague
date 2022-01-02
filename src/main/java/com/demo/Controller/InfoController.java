package com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {


    @RequestMapping("api/welcome")
    public String WelcomeInfo(){
        return "welcome! the platform is under building!";
    }

}
