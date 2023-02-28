package com.codegym.controller;


import com.codegym.dto.request.SignInForm;
import com.codegym.model.user.Role;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Set;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthRestController_login {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MockMvc mockMvc;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void login_signInForm_username_null_13() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setPassword("123");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_username_blank_14() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setPassword("");
        signInForm.setPassword("123");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_username_wrong_format_15() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cuon-- ");
        signInForm.setPassword("cuon--");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_username_minlength_16() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cu");
        signInForm.setPassword("cuo");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_username_wrong_format_17() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cuo");
        signInForm.setPassword("dsa");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_username_success_18() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cuong123");
        signInForm.setPassword("cuong123");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
    @Test
    public void login_signInForm_password_null_13() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cuong123");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_password_blank_14() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setPassword("");
        signInForm.setUsername("cuong123");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_password_wrong_format_15() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cuon-- ");
        signInForm.setPassword("cuon--");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_password_minlength_16() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cu");
        signInForm.setPassword("cuo");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_password_wrong_format_17() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cuo");
        signInForm.setPassword("dsa");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void login_signInForm_password_success_18() throws Exception {
        SignInForm signInForm = new SignInForm();
        signInForm.setUsername("cuong123");
        signInForm.setPassword("cuong123");
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/auth/login")
                        .content(this.objectMapper.writeValueAsString(signInForm))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}
