package com.bryansiegel.openbookjava.controllers.api;


import com.bryansiegel.openbookjava.models.ElementarySchools;
import com.bryansiegel.openbookjava.repositories.ElementarySchoolsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ElementarySchoolApiController {

    private final ElementarySchoolsRepo elementarySchoolsRepo;

    @Autowired
    public ElementarySchoolApiController(ElementarySchoolsRepo elementarySchoolsRepo) {
        this.elementarySchoolsRepo = elementarySchoolsRepo;
    }

    @GetMapping("/api/elementary-schools")
    public List<ElementarySchools> getAllElementarySchools() {
        return elementarySchoolsRepo.findAll();
    }

}
