package com.vedannt.springExamples.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/other")
    public String other() {
        return "pagina2";
    }

}
