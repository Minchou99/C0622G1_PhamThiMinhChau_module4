package dictionary.controller;

import dictionary.repository.IDicRepo;
import dictionary.service.IDicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDicService dicService;

    @GetMapping
    public String showForm(){
        return "list";
    }

    @PostMapping
    public String translate(@RequestParam String word, Model model){
        String trans = dicService.find(word);
        model.addAttribute("trans",trans);
        model.addAttribute("word",word);
        return "list";
    }
}
