package com.example.gstestingweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(path = "/greeting")
    public @ResponseBody String greeting(@RequestParam(required = false, defaultValue = "world") String name){
        String encoded = null; 

        if ((name != null) && (!name.isEmpty())){
            encoded = name;
        }
        
        return "Hello, " + encoded;
    }    
}
