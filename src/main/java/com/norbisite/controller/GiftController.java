package com.norbisite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GiftController {

    @GetMapping("/cute")
    public String cute(){
        return "gifts/cubeCute";
    }
}
