package com.codegym.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SupplierRestController_findSupplier {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findSupplier_id_1() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/supplier/supplier?id=" + "null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void findSupplier_id_2() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/supplier/supplier?id=" + ""))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void findSupplier_id_3() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/supplier/supplier?id=" + 100))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getInfoStudent_id_4() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/supplier/supplier?id=" + 1))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpectAll(jsonPath("id").value(1),
                        jsonPath("name").value("Sony"),
                        jsonPath("address").value("Bắc Giang"),
                        jsonPath("phoneNumber").value("0976707704"));
    }
}
