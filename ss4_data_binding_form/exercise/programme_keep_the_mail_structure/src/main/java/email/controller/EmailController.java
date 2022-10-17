package email.controller;

import email.model.Email;
import email.service.IEmailService;
import email.service.impl.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.awt.*;
import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
    IEmailService emailService = new EmailService();

    @GetMapping("/form/{id}")
    public String showForm(@PathVariable int id, Model model) {
        model.addAttribute("languageList", emailService.showLanguage());
        model.addAttribute("sizeList", emailService.showSize());
        model.addAttribute("email", emailService.getEmail(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Email email) {
        emailService.edit(email);
        return "redirect:/email/home";
    }

    @GetMapping("/home")
    public String showList(Model model){
        List<Email> emailList = emailService.getEmailList();
        model.addAttribute("emailList",emailList);
        return "home";
    }

}
