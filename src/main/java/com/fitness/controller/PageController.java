package com.fitness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping(value = {"/", "/index", "/index.html"})
    public String index() {
        return "index";
    }

    @GetMapping(value = "customers")
    public String customers() {
        return "customers";
    }


    @GetMapping(value = "edit-customers")
    public String edit_customers() {
        return "edit-customers";
    }


    @GetMapping(value = "positions")
    public String positions() {
        return "positions";
    }


    @GetMapping(value = "edit-positions")
    public String edit_positions() {
        return "edit-positions";
    }

    @GetMapping(value = "employees")
    public String employees() {
        return "employees";
    }


    @GetMapping(value = "edit-employees")
    public String edit_employees() {
        return "edit-employees";
    }
}
