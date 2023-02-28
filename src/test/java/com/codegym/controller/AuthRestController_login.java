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

//    @Test
//    public void login_signInForm_13() throws Exception {

//        SignInForm signInForm = new SignInForm();
//        signInForm.set("");
//        signInForm.setGrade(8.0);
//        signInForm.setDateOfBirth("2000-10-05");
//        signInForm.setGender(1);
//        Set<Role>
//        ClassStudentDto classStudentDto = new ClassStudentDto();
//        classStudentDto.setId(2);
//        studentDto.setClassStudentDto(classStudentDto);

//        this.mockMvc
//                .perform(MockMvcRequestBuilders
//                        .post("/studentRest/create")
//                        .content(this.objectMapper.writeValueAsString(studentDto))
//                        .contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andDo(print())
//                .andExpect(status().is4xxClientError());
//    }
}
