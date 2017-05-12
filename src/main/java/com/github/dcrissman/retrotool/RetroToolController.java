package com.github.dcrissman.retrotool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class RetroToolController {

    @GetMapping
    public String hello(String name) {
        return "hello " + name;
    }

}
