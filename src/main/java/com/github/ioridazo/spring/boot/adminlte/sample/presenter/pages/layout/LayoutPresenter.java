package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages.layout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutPresenter {

    @GetMapping("/pages/layout/top-nav.html")
    public String pagesLayoutTopNav() {
        return "pages/layout/top-nav";
    }

    @GetMapping("/pages/layout/top-nav-sidebar.html")
    public String pagesLayoutTopNavSidebar() {
        return "pages/layout/top-nav-sidebar";
    }

    @GetMapping("/pages/layout/boxed.html")
    public String pagesLayoutBoxed() {
        return "pages/layout/boxed";
    }

    @GetMapping("/pages/layout/fixed-sidebar.html")
    public String pagesLayoutFixedSidebar() {
        return "pages/layout/fixed-sidebar";
    }

    @GetMapping("/pages/layout/fixed-sidebar-custom.html")
    public String pagesLayoutFixedSidebarCustom() {
        return "pages/layout/fixed-sidebar-custom";
    }

    @GetMapping("/pages/layout/fixed-topnav.html")
    public String pagesLayoutFixedTopnav() {
        return "pages/layout/fixed-topnav";
    }

    @GetMapping("/pages/layout/fixed-footer.html")
    public String pagesLayoutFixedFooter() {
        return "pages/layout/fixed-footer";
    }

    @GetMapping("/pages/layout/collapsed-sidebar.html")
    public String pagesLayoutCollapsedSidebar() {
        return "pages/layout/collapsed-sidebar";
    }
}
