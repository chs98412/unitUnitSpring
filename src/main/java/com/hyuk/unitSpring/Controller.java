package com.hyuk.unitSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("start")
public class Controller {
    @GetMapping("/first")
    public String firstApi() {
        return "Hello World";
    }
}





