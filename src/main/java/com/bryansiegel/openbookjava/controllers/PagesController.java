package com.bryansiegel.openbookjava.controllers;

import org.springframework.ui.Model;
import com.bryansiegel.openbookjava.repositories.CMSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    private final CMSRepo cmsRepo;

    @Autowired
    public PagesController(CMSRepo cmsRepo) {
        this.cmsRepo = cmsRepo;
    }


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("cms", cmsRepo.findAll());
        return "public/index";
    }
}
