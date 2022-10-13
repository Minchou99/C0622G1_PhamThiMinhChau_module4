package com.exercise.controller;

import com.exercise.service.ConvertService;
import com.exercise.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class ConvertController {
    @Autowired
     IConvertService convertService;

    @GetMapping
    public String showForm(){
        return "list";
    }
    @PostMapping
    public String convert(@RequestParam double rate, @RequestParam double usd, Model model){
       double vnd = convertService.convert(rate,usd);
       model.addAttribute("vnd", vnd);
       model.addAttribute("rate",rate);
       model.addAttribute("usd",usd);
        return "list";
    }

}
