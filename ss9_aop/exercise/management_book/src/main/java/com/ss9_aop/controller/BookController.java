package com.ss9_aop.controller;

import com.ss9_aop.model.Book;
import com.ss9_aop.model.OrderBook;
import com.ss9_aop.service.IBookService;
import com.ss9_aop.service.IOrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private IOrderBookService orderBookService;

    @GetMapping("/list")
    public String showList(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("book", bookList);
        return "list";
    }

    @GetMapping("/{id}/order")
    public String order(@PathVariable int id, Model model) {
        OrderBook orderBook = new OrderBook();
        int code = (int) (Math.random() * (99999 - 10000) + 10000);
        orderBook.setCode(code);

        orderBook.setDate(new Date(System.currentTimeMillis()));

        orderBook.setBook(bookService.findById(id));
        orderBookService.save(orderBook);

        model.addAttribute("order", orderBook);

        model.addAttribute("book", bookService.findById(id));

        return "borrow";
    }

    @PostMapping("/order")
    public String submitOrder(@RequestParam int id, Book book, Model model) throws Exception {
        Book books = bookService.findById(id);
        books.setCount(books.getCount() - 1);

        if (books.getCount() == -1) {
            throw new Exception();
        }

        bookService.save(books);
        model.addAttribute("book", bookService.findAll());
        return "list";
    }

    @GetMapping("/view")
    public String view(@RequestParam int id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        model.addAttribute("orderBook", orderBookService.findAll());
        return "view";
    }

    @ExceptionHandler(Exception.class)
    public String handleError() {
        return "error";
    }
}
