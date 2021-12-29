package com.example.gstestingweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(path = "/greeting")
    public @ResponseBody String greeting(){
        return "Hello, world from Java";
    }    
}
