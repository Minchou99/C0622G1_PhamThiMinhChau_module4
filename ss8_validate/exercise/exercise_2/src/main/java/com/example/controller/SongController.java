package com.example.controller;

import com.example.dto.SongDto;
import com.example.model.Song;
import com.example.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("/list")
    public ModelAndView showList() {
        return new ModelAndView("list", "song", songService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("songDto", new SongDto());
        return modelAndView;
    }

    @PostMapping("/save")
    public String create(@Validated @ModelAttribute SongDto songDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);

            songService.save(song);
            redirectAttributes.addFlashAttribute("message",
                    "Create song: " + song.getName() + " OK! ");
            return "redirect:/song/list";
        }
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam int id, Model model) {
        Song song = songService.findById(id);
        SongDto songDto = new SongDto();
        BeanUtils.copyProperties(song,songDto);
        model.addAttribute("songDto",songDto);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute SongDto songDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "edit";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);

            songService.save(song);
            redirectAttributes.addFlashAttribute("message",
                    "Edit song: " + song.getName() + " OK! ");
            return "redirect:/song/list";
        }
    }

}
