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

    //admin/create
    @PostMapping("/admin/elementary-schools/create")
    public String saveElementarySchool(ElementarySchools elementarySchools) {
        elementarySchoolsRepo.save(elementarySchools);
        return "redirect:/admin/elementary-schools/";
    }

    //admin/edit
    @GetMapping("/admin/elementary-schools/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        ElementarySchools elementarySchools = elementarySchoolsRepo.findById(id).orElse(null);
        model.addAttribute("elementarySchools", elementarySchools);
        return "admin/ElementarySchools/edit";
    }

    //admin/show
    @GetMapping("/admin/elementary-schools/show/{id}")
    public String show(@PathVariable Long id, Model model) {
        ElementarySchools elementarySchools = elementarySchoolsRepo.findById(id).orElse(null);
        model.addAttribute("elementarySchools", elementarySchools);

        return "/admin/ElementarySchools/show";
    }

    //admin/delete
    @GetMapping("/admin/elementary-schools/delete/{id}")
    public String delete(@PathVariable Long id) {
        elementarySchoolsRepo.deleteById(id);
        return "redirect:/admin/elementary-schools/";
    }

    //public index
    @GetMapping("/elementary-schools/")
    public String publicIndex() {
        return "public/ElementarySchools/index";
    }


}
