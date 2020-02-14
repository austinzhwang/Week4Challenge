package com.austin.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "blog";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/blog/sbvsb")
    public String sbvsb() {
        return "sbvsb";
    }

    @RequestMapping("/blog/inheritance")
    public String inheritance() {
        return "inheritance";
    }

    @RequestMapping("/blog/ghwt")
    public String ghwt() {
        return "ghwt";
    }

    @RequestMapping("/blog/abstraction")
    public String abstraction() {
        return "abstraction";
    }

    @RequestMapping("/blog/loops")
    public String loops() {
        return "loops";
    }

    @RequestMapping("/blog/ght")
    public String ght() {
        return "ght";
    }
}


