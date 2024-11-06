package com.restapi.crudop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/sayhelloworld")
    public String HelloWorld() {
        return ("he hi team finaly we started our advance java ");
    }


}
