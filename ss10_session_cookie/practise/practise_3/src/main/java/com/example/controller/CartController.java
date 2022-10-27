package com.example.controller;

import com.example.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

    @GetMapping("/shopping-cart")
    public ModelAndView showCart(@SessionAttribute(value = "cart", required = false) CartDto cart) {
        return new ModelAndView("cart/list", "cart", cart);
    }
}
