package com.bryansiegel.openbookjava.controllers;

import com.bryansiegel.openbookjava.models.ElementarySchools;
import com.bryansiegel.openbookjava.repositories.ElementarySchoolsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ElementarySchoolsController {


    private final ElementarySchoolsRepo elementarySchoolsRepo;



    @Autowired
    public ElementarySchoolsController(ElementarySchoolsRepo elementarySchoolsRepo) {
        this.elementarySchoolsRepo = elementarySchoolsRepo;
    }


    //admin/index
    @GetMapping("/admin/elementary-schools/")
    public String index(Authentication authentication, Model model) {
        model.addAttribute("elementarySchools", elementarySchoolsRepo.findAll());
        model.addAttribute("user", authentication.getName());

        return "admin/ElementarySchools/index";
    }

    //admin/create
    @GetMapping("/admin/elementary-schools/create")
    public String create(ElementarySchoolsRepo elementarySchoolsRepo, Authentication authentication,Model model) {
        model.addAttribute("elementarySchools", elementarySchoolsRepo);
        model.addAttribute("user", authentication.getName());

        return "admin/ElementarySchools/create";
    }

    //admin/store
    @PostMapping("/admin/elementary-schools/store")
    public String saveElementarySchool(ElementarySchools elementarySchools, RedirectAttributes redirectAttributes, Authentication authentication) {
        redirectAttributes.addFlashAttribute("message", "Elementary School submitted successfully!");
        elementarySchoolsRepo.save(elementarySchools);

        return "redirect:/admin/elementary-schools/";
    }

    //admin/edit
    @GetMapping("/admin/elementary-schools/edit/{id}")
    public String edit(@PathVariable Long id, Authentication authentication, Model model) {
        ElementarySchools elementarySchools = elementarySchoolsRepo.findById(id).orElse(null);
        model.addAttribute("elementarySchools", elementarySchools);
        model.addAttribute("user", authentication.getName());

        return "admin/ElementarySchools/edit";
    }

    //admin/show
    @GetMapping("/admin/elementary-schools/show/{id}")
    public String show(@PathVariable Long id, Authentication authentication, Model model) {
        ElementarySchools elementarySchools = elementarySchoolsRepo.findById(id).orElse(null);
        model.addAttribute("elementarySchools", elementarySchools);
        model.addAttribute("user", authentication.getName());

        return "/admin/ElementarySchools/show";
    }

    //admin/delete
    @GetMapping("/admin/elementary-schools/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Elementary School Deleted successfully!");
        elementarySchoolsRepo.deleteById(id);

        return "redirect:/admin/elementary-schools/";
    }

    //public index
    @GetMapping("/elementary-schools/")
    public String publicIndex() {

        return "public/ElementarySchools/index";
    }


}
