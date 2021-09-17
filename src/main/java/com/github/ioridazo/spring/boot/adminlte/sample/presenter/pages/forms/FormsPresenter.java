package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages.forms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormsPresenter {

    @GetMapping("/pages/forms/general.html")
    public String pagesFormsgeneral() {
        return "pages/forms/general";
    }

    @GetMapping("/pages/forms/advanced.html")
    public String pagesFormsAdvanced() {
        return "pages/forms/advanced";
    }

    @GetMapping("/pages/forms/editors.html")
    public String pagesFormsEditors() {
        return "pages/forms/editors";
    }

    @GetMapping("/pages/forms/validation.html")
    public String pagesFormsValidation() {
        return "pages/forms/validation";
    }
}
