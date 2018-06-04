package com.kevin.controller;

/**
 * Created by jinyugai on 2018/6/1.
 */

import com.kevin.service.IBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**图书控制器*/
@Controller
@RequestMapping("/Book")
public class BookController {
    @Resource
    IBookService bookService;
    @RequestMapping("/list")
    public String list(Model model){
        //获得所有的图书带到页面中
        model.addAttribute("books",bookService.getAllBooks());
        return "Book/list";//WBB_INF/Views/Book/list.jsp
    }


}
