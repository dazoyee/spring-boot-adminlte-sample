package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages.tables;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TablesPresenter {

    @GetMapping("/pages/tables/simple.html")
    public String pagesTablesSimple() {
        return "pages/tables/simple";
    }

    @GetMapping("/pages/tables/data.html")
    public String pagesTablesData() {
        return "pages/tables/data";
    }

    @GetMapping("/pages/tables/jsgrid.html")
    public String pagesTablesJsgrid() {
        return "pages/tables/jsgrid";
    }
}
