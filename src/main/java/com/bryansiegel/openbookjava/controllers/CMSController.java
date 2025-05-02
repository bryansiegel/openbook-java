package com.bryansiegel.openbookjava.controllers;

import com.bryansiegel.openbookjava.models.CMS;
import com.bryansiegel.openbookjava.repositories.CMSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CMSController {


    private final CMSRepo cmsRepo;

    @Autowired
    public CMSController(CMSRepo cmsRepo) {
        this.cmsRepo = cmsRepo;
    }

    @GetMapping("admin/cms/")
    private String index(Model model) {
        CMS cms = cmsRepo.findAll().isEmpty() ? new CMS() : cmsRepo.findAll().get(0);
        model.addAttribute("cms", cms);
        return "admin/CMS/index";
    }

    @PostMapping("admin/cms/save")
    public String saveCMS(@ModelAttribute CMS cms) {
        if (cms.getId() != null && cmsRepo.existsById(cms.getId())) {
            CMS existingCMS = cmsRepo.findById(cms.getId()).orElseThrow();
            existingCMS.setHeaderTitle(cms.getHeaderTitle());
            existingCMS.setHeaderParagraph(cms.getHeaderParagraph());
            existingCMS.setIntroTitle(cms.getIntroTitle());
            existingCMS.setIntroNumber(cms.getIntroNumber());
            existingCMS.setIntroSentenceUnderNumber(cms.getIntroSentenceUnderNumber());
            existingCMS.setIntroParagraph(cms.getIntroParagraph());
            existingCMS.setBluePrintTitle(cms.getBluePrintTitle());
            existingCMS.setBlueprintParagraph(cms.getBlueprintParagraph());
            // Add other fields as needed
            cmsRepo.save(existingCMS);
        } else {
            cmsRepo.save(cms);
        }
        return "redirect:/admin/cms/";
    }

}
