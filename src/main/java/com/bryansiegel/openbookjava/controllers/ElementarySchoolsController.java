package com.bryansiegel.openbookjava.controllers;

import com.bryansiegel.openbookjava.repositories.ElementarySchoolsRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElementarySchoolsController {

    public ElementarySchoolsController(ElementarySchoolsRepo elementarySchoolsRepo) {
        ElementarySchoolsRepo elementarySchoolsRepo1 = elementarySchoolsRepo;
    }

    @GetMapping("/admin/elementary-schools/")
    public String index() {
        return "admin/ElementarySchools/index";
    }

    @GetMapping("/admin/elementary-schools/create")
    public String create() {
        return "admin/ElementarySchools/create";
    }

    @GetMapping("/admin/elementary-schools/store")
    public String store() {
        return "admin/ElementarySchools/store";
    }

    @GetMapping("/admin/elementary-schools/edit/{id}")
    public String edit(int id) {
        return "admin/ElementarySchools/edit/{id}";
    }

    @GetMapping("/admin/elementary-schools/show/{id}")
    public String show(int id) {
        return "admin/ElementarySchools/show/{id}";
    }

    @GetMapping("/admin/elementary-schools/delete/{id}")
    public String delete(int id) {
        return "admin/ElementarySchools/delete/{id}";
    }

    //public index
    @GetMapping("/elementary-schools/")
    public String publicIndex() {
        return "public/ElementarySchools/index";
    }


}
