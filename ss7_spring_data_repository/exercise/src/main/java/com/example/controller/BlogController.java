package com.example.controller;

import com.example.model.Blog;
import com.example.service.IBlogService;
import com.example.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String showBlogList(@PageableDefault Pageable pageable, Model model) {
        Page<Blog> blogList = blogService.findAll(pageable);
        model.addAttribute("blog", blogList);
        return "list";
    }

//    @GetMapping
//    public String showBlogList(Model model) {
//        List<Blog> blogList = blogService.findAll();
//        model.addAttribute("blog", blogList);
//        return "list";
//    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("category", categoryService.findAll());
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blog.setDateOfPost(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Create blog: " + blog.getName() + " ok!");
        return "redirect:/blog";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("category", categoryService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        blogService.remove(blog);
        redirect.addFlashAttribute("success", "Removed blog successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("category", categoryService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Blog blog) {
        blog.setDateOfPost(new Date(System.currentTimeMillis()));
        blogService.update(blog);
        return "redirect:/blog";
    }

    @GetMapping("/view")
    public String view(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("category", categoryService.findById(id));
        return "view";
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam String nameSearch) {
        List<Blog> blogList = blogService.findByName(nameSearch);
        return new ModelAndView("list", "blog", blogList);
    }

}
