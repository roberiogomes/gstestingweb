package com.example.gstestingweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(path = "/greeting")
    public @ResponseBody String greeting(@RequestParam(required = false) String name){
        String result = null;

        if ((name == null) || name.isEmpty()){
            result = "Hello, world!";
        } else {
            result = "Hello, " + name;
        }

        return result;
    }    
}
