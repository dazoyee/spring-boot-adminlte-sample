package com.github.ioridazo.spring.boot.adminlte.sample.presenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPresenter {

    @GetMapping("/starter.html")
    public String starter() {
        return "starter";
    }

    @GetMapping({"/", "/index.html"})
    public String index() {
        return "index";
    }

    @GetMapping("/index2.html")
    public String index2() {
        return "index2";
    }

    @GetMapping("/index3.html")
    public String index3() {
        return "index3";
    }

    @GetMapping("/iframe.html")
    public String iframe() {
        return "iframe";
    }
}
