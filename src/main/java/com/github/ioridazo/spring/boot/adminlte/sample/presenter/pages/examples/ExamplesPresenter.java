package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamplesPresenter {

    @GetMapping("/pages/examples/invoice.html")
    public String pagesExamplesInvoice() {
        return "pages/examples/invoice";
    }

    @GetMapping("/pages/examples/profile.html")
    public String pagesExamplesProfile() {
        return "pages/examples/profile";
    }

    @GetMapping("/pages/examples/e-commerce.html")
    public String pagesExamplesEcommerce() {
        return "pages/examples/e-commerce";
    }

    @GetMapping("/pages/examples/projects.html")
    public String pagesExamplesProjects() {
        return "pages/examples/projects";
    }

    @GetMapping("/pages/examples/project-add.html")
    public String pagesExamplesProjectAdd() {
        return "pages/examples/project-add";
    }

    @GetMapping("/pages/examples/project-edit.html")
    public String pagesExamplesProjectEdit() {
        return "pages/examples/project-edit";
    }

    @GetMapping("/pages/examples/project-detail.html")
    public String pagesExamplesProjectDetail() {
        return "pages/examples/project-detail";
    }

    @GetMapping("/pages/examples/contacts.html")
    public String pagesExamplesContacts() {
        return "pages/examples/contacts";
    }

    @GetMapping("/pages/examples/faq.html")
    public String pagesExamplesFaq() {
        return "pages/examples/faq";
    }

    @GetMapping("/pages/examples/contact-us.html")
    public String pagesExamplesContactUs() {
        return "pages/examples/contact-us";
    }

    @GetMapping("/pages/examples/login.html")
    public String pagesExamplesLogin() {
        return "pages/examples/login";
    }

    @GetMapping("/pages/examples/register.html")
    public String pagesExamplesRegister() {
        return "pages/examples/register";
    }

    @GetMapping("/pages/examples/forgot-password.html")
    public String pagesExamplesForgotPassword() {
        return "pages/examples/forgot-password";
    }

    @GetMapping("/pages/examples/recover-password.html")
    public String pagesExamplesRecoverPassword() {
        return "pages/examples/recover-password";
    }

    @GetMapping("/pages/examples/login-v2.html")
    public String pagesExamplesLoginV2() {
        return "pages/examples/login-v2";
    }

    @GetMapping("/pages/examples/register-v2.html")
    public String pagesExamplesRegisterV2() {
        return "pages/examples/register-v2";
    }

    @GetMapping("/pages/examples/forgot-password-v2.html")
    public String pagesExamplesForgotPasswordV2() {
        return "pages/examples/forgot-password-v2";
    }

    @GetMapping("/pages/examples/recover-password-v2.html")
    public String pagesExamplesRecoverPasswordV2() {
        return "pages/examples/recover-password-v2";
    }

    @GetMapping("/pages/examples/lockscreen.html")
    public String pagesExampleslockscreen() {
        return "pages/examples/lockscreen";
    }

    @GetMapping("/pages/examples/legacy-user-menu.html")
    public String pagesExamplesLegacyUserMenu() {
        return "pages/examples/legacy-user-menu";
    }

    @GetMapping("/pages/examples/language-menu.html")
    public String pagesExamplesLanguageMenu() {
        return "pages/examples/language-menu";
    }


    @GetMapping("/pages/examples/404.html")
    public String pagesExamples404() {
        return "pages/examples/404";
    }


    @GetMapping("/pages/examples/500.html")
    public String pagesExamples500() {
        return "pages/examples/500";
    }


    @GetMapping("/pages/examples/pace.html")
    public String pagesExampleSpace() {
        return "pages/examples/pace";
    }


    @GetMapping("/pages/examples/blank.html")
    public String pagesExamplesBlank() {
        return "pages/examples/blank";
    }
}
