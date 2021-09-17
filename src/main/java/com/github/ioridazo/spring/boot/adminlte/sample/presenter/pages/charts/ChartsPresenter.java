package com.github.ioridazo.spring.boot.adminlte.sample.presenter.pages.charts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartsPresenter {

    @GetMapping("/pages/charts/chartjs.html")
    public String pagesChartsChartjs() {
        return "pages/charts/chartjs";
    }

    @GetMapping("/pages/charts/flot.html")
    public String pagesChartsFlot() {
        return "pages/charts/flot";
    }

    @GetMapping("/pages/charts/inline.html")
    public String pagesChartsInline() {
        return "pages/charts/inline";
    }

    @GetMapping("/pages/charts/uplot.html")
    public String pagesChartsUplot() {
        return "pages/charts/uplot";
    }
}
