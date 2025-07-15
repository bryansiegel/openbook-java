package com.bryansiegel.openbookjava.controllers;

import com.bryansiegel.openbookjava.models.ElementarySchools;
import com.bryansiegel.openbookjava.repositories.ElementarySchoolsRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ElementarySchoolsControllerTest {

    @Mock
    private ElementarySchoolsRepo elementarySchoolsRepo;

    @Mock
    private Authentication authentication;

    @Mock
    private Model model;

    @Mock
    private RedirectAttributes redirectAttributes;

    private ElementarySchoolsController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controller = new ElementarySchoolsController(elementarySchoolsRepo);
    }

    @Test
    void testIndex() {
        when(authentication.getName()).thenReturn("testuser");
        
        String result = controller.index(authentication, model);
        
        assertEquals("admin/ElementarySchools/index", result);
        verify(model).addAttribute("elementarySchools", elementarySchoolsRepo.findAll());
        verify(model).addAttribute("user", "testuser");
    }

    @Test
    void testCreate() {
        when(authentication.getName()).thenReturn("testuser");
        
        String result = controller.create(elementarySchoolsRepo, authentication, model);
        
        assertEquals("admin/ElementarySchools/create", result);
        verify(model).addAttribute("elementarySchools", elementarySchoolsRepo);
        verify(model).addAttribute("user", "testuser");
    }

    @Test
    void testSaveElementarySchool() {
        ElementarySchools elementarySchools = new ElementarySchools();
        elementarySchools.setSchoolName("Test School");
        
        String result = controller.saveElementarySchool(elementarySchools, redirectAttributes, authentication);
        
        assertEquals("redirect:/admin/elementary-schools/", result);
        verify(redirectAttributes).addFlashAttribute("message", "Elementary School submitted successfully!");
        verify(elementarySchoolsRepo).save(elementarySchools);
    }

    @Test
    void testEdit() {
        Long id = 1L;
        ElementarySchools elementarySchools = new ElementarySchools();
        elementarySchools.setId(id);
        elementarySchools.setSchoolName("Test School");
        
        when(authentication.getName()).thenReturn("testuser");
        when(elementarySchoolsRepo.findById(id)).thenReturn(Optional.of(elementarySchools));
        
        String result = controller.edit(id, authentication, model);
        
        assertEquals("admin/ElementarySchools/edit", result);
        verify(model).addAttribute("elementarySchools", elementarySchools);
        verify(model).addAttribute("user", "testuser");
    }

    @Test
    void testShow() {
        Long id = 1L;
        ElementarySchools elementarySchools = new ElementarySchools();
        elementarySchools.setId(id);
        elementarySchools.setSchoolName("Test School");
        
        when(authentication.getName()).thenReturn("testuser");
        when(elementarySchoolsRepo.findById(id)).thenReturn(Optional.of(elementarySchools));
        
        String result = controller.show(id, authentication, model);
        
        assertEquals("/admin/ElementarySchools/show", result);
        verify(model).addAttribute("elementarySchools", elementarySchools);
        verify(model).addAttribute("user", "testuser");
    }

    @Test
    void testDelete() {
        Long id = 1L;
        
        String result = controller.delete(id, redirectAttributes);
        
        assertEquals("redirect:/admin/elementary-schools/", result);
        verify(redirectAttributes).addFlashAttribute("message", "Elementary School Deleted successfully!");
        verify(elementarySchoolsRepo).deleteById(id);
    }

    @Test
    void testPublicIndex() {
        String result = controller.publicIndex();
        assertEquals("public/ElementarySchools/index", result);
    }
}