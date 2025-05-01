package com.bryansiegel.openbookjava.controllers;

import com.bryansiegel.openbookjava.repositories.ElementarySchoolsRepo;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    private final ElementarySchoolsRepo elementarySchoolsRepo;

    public AuthController(ElementarySchoolsRepo elementarySchoolsRepo) {
        this.elementarySchoolsRepo = elementarySchoolsRepo;
    }

    @GetMapping("/login")
    public String login() {
        return "admin/login";
    }

    @GetMapping("/login-error/")
    public String loginError() {
        return "admin/login-error";
    }

    @GetMapping("admin/dashboard/")
    public String dashboard(Authentication authentication, Model model) {
        model.addAttribute("user", authentication.getName());
        model.addAttribute("elementarySchools", elementarySchoolsRepo.findAll());

        return "admin/dashboard";
    }
}
