package com.bryansiegel.openbookjava.controllers;

import com.bryansiegel.openbookjava.repositories.CMSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CMSController {


    private final CMSRepo cmsRepo;

    @Autowired
    public CMSController(CMSRepo cmsRepo) {
        this.cmsRepo = cmsRepo;
    }

@GetMapping("admin/cms/")
    private String index(Model model) {
        model.addAttribute("cms", cmsRepo.findAll().get(0));
        return "admin/CMS/index";
    }

}
