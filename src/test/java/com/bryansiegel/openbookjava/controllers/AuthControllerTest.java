package com.bryansiegel.openbookjava.controllers;

import com.bryansiegel.openbookjava.repositories.ElementarySchoolsRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

class AuthControllerTest {

    @Mock
    private ElementarySchoolsRepo elementarySchoolsRepo;

    @Mock
    private Authentication authentication;

    @Mock
    private Model model;

    private AuthController authController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        authController = new AuthController(elementarySchoolsRepo);
    }

    @Test
    void testLogin() {
        String result = authController.login();
        assertEquals("admin/login", result);
    }

    @Test
    void testLoginError() {
        String result = authController.loginError();
        assertEquals("admin/login-error", result);
    }

    @Test
    void testDashboard() {
        when(authentication.getName()).thenReturn("testuser");
        
        String result = authController.dashboard(authentication, model);
        
        assertEquals("admin/dashboard", result);
        verify(model).addAttribute("user", "testuser");
        verify(model).addAttribute(eq("elementarySchools"), any());
        verify(elementarySchoolsRepo).findAll();
    }
}