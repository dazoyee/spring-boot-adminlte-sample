package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UiController {

    @GetMapping("/pages/UI/general.html")
    public String pagesUiGeneral() {
        return "pages/UI/general";
    }

    @GetMapping("/pages/UI/icons.html")
    public String pagesUiIcons() {
        return "pages/UI/icons";
    }

    @GetMapping("/pages/UI/buttons.html")
    public String pagesUiButtons() {
        return "pages/UI/buttons";
    }

    @GetMapping("/pages/UI/sliders.html")
    public String pagesUiSliders() {
        return "pages/UI/sliders";
    }

    @GetMapping("/pages/UI/modals.html")
    public String pagesUiModals() {
        return "pages/UI/modals";
    }

    @GetMapping("/pages/UI/navbar.html")
    public String pagesUiNavbar() {
        return "pages/UI/navbar";
    }

    @GetMapping("/pages/UI/timeline.html")
    public String pagesUiTimeline() {
        return "pages/UI/timeline";
    }

    @GetMapping("/pages/UI/ribbons.html")
    public String pagesUiRibbons() {
        return "pages/UI/ribbons";
    }
}
