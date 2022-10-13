package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerManagementController {
    @GetMapping("/list")
    public String k(){

        return "mChau";
    }
}
