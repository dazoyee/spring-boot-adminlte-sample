package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchPresenter {

    @GetMapping("/pages/search/simple.html")
    public String pagesSearchSimple() {
        return "pages/search/simple";
    }

    @GetMapping("/pages/search/enhanced.html")
    public String pagesSearchEnhanced() {
        return "pages/search/enhanced";
    }

    @GetMapping("/a.html")
    public String p() {
        return "";
    }
}
