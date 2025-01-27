package com.bryansiegel.openbookjava.controllers;

import com.bryansiegel.openbookjava.models.ElementarySchools;
import com.bryansiegel.openbookjava.repositories.ElementarySchoolsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ElementarySchoolsController {

    private final ElementarySchoolsRepo elementarySchoolsRepo;

    @Autowired
    public ElementarySchoolsController(ElementarySchoolsRepo elementarySchoolsRepo) {
        this.elementarySchoolsRepo = elementarySchoolsRepo;
    }

    //admin/index
    @GetMapping("/admin/elementary-schools/")
    public String index( Model model) {
        model.addAttribute("elementarySchools", elementarySchoolsRepo.findAll());
        return "admin/ElementarySchools/index";
    }

    //admin/create
    @GetMapping("/admin/elementary-schools/create")
    public String create(ElementarySchoolsRepo elementarySchoolsRepo, Model model) {
        model.addAttribute("elementarySchools", elementarySchoolsRepo);
        return "admin/ElementarySchools/create";
    }

    //admin/store
    @PostMapping("/admin/elementary-schools/create")
    public String saveElementarySchool(ElementarySchools elementarySchools) {
        elementarySchoolsRepo.save(elementarySchools);
        return "redirect:/admin/elementary-schools/";
    }

    //admin/edit
    @GetMapping("/admin/elementary-schools/edit/{id}")
    public String edit(@PathVariable Long id, ElementarySchoolsRepo elementarySchoolsRepo, Model model) {
        model.addAttribute("elementarySchools", elementarySchoolsRepo.findById(id));
        return "admin/ElementarySchools/edit/{id}";
    }

    //admin/show
    @GetMapping("/admin/elementary-schools/show/{id}")
    public String show(@PathVariable Long id, ElementarySchoolsRepo elementarySchoolsRepo, Model model) {
        Model elementarySchools = model.addAttribute("elementarySchools", elementarySchoolsRepo.findById(id));
        return "admin/ElementarySchools/show/{id}";
    }

    //admin/delete
    @GetMapping("/admin/elementary-schools/delete/{id}")
    public String delete(@PathVariable Long id, ElementarySchoolsRepo elementarySchoolsRepo, Model model) {
        Model elementarySchools = model.addAttribute("elementarySchools", elementarySchoolsRepo.findById(id));
        return "admin/ElementarySchools/delete/{id}";
    }

    //public index
    @GetMapping("/elementary-schools/")
    public String publicIndex() {
        return "public/ElementarySchools/index";
    }


}
