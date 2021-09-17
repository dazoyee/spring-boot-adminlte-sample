package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesPresenter {

    @GetMapping("/pages/widgets.html")
    public String pagesWidgets() {
        return "pages/widgets";
    }

    @GetMapping("/pages/calendar.html")
    public String pagesCalendar() {
        return "pages/calendar";
    }

    @GetMapping("/pages/gallery.html")
    public String pagesGallery() {
        return "pages/gallery";
    }

    @GetMapping("/pages/kanban.html")
    public String pagesKanban() {
        return "pages/kanban";
    }
}
