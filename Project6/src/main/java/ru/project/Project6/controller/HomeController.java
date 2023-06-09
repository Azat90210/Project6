package ru.project.Project6.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

}
