package calculate.controller;

import calculate.service.ICalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class CalculateController {
    @Autowired
    ICalculateService calculateService;

    @GetMapping("/")
    public String showForm() {
        return "list";
    }

    @PostMapping("/cal")
    public String result(@RequestParam(required = false) double a, double b, String submit, Model model) {
        double result = calculateService.calculator(a, b, submit);
        model.addAttribute("result", result);
        return "list";
    }

}
