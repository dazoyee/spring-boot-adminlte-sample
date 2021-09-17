package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages.mailbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MailboxPresenter {

    @GetMapping("/pages/mailbox/mailbox.html")
    public String pagesMailboxMailbox() {
        return "pages/mailbox/mailbox";
    }

    @GetMapping("/pages/mailbox/compose.html")
    public String pagesMailboxCompose() {
        return "pages/mailbox/compose";
    }

    @GetMapping("/pages/mailbox/read-mail.html")
    public String pagesMailboxReadMail() {
        return "pages/mailbox/read-mail";
    }
}
