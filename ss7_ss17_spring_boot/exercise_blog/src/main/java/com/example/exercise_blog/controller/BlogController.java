package com.example.exercise_blog.controller;

import com.example.exercise_blog.model.Bloger;
import com.example.exercise_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping
    public String showBlogList(Model model) {
        List<Bloger> blogList = blogService.findAll();
        model.addAttribute("blog", blogList);
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Bloger());
        return "create";
    }

    @PostMapping("/save")
    public String save(Bloger blog) {
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Bloger blog, RedirectAttributes redirect) {
        blogService.remove(blog);
        redirect.addFlashAttribute("success", "Removed blog successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Bloger blog) {
        blogService.update(blog);
        return "redirect:/blog";
    }

    @GetMapping("/view")
    public String view(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }

}
