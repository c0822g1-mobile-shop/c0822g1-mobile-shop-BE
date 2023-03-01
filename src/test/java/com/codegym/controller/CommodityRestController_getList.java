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
public class CommodityRestController_getList {
    @Autowired
    private MockMvc mockMvc;

    /**
     * this function use to test the validation of list rather more specific is list size greater than 0
     *
     * @author CongBD
     * @Time 16:00 28/02/2023
     */
    @Test
    public void getListCommodity_6() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/commodity/list"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(2))
                .andExpect(jsonPath("totalElements").value(3))
                .andExpect(jsonPath("content[0].name").value("Samsung Galaxy S22 ultra"))
                .andExpect(jsonPath("content[0].cpu").value("Snapdragon 8 Gen 1"))
                .andExpect(jsonPath("content[0].capacity").value("128 GB"))
                .andExpect(jsonPath("content[0].trademark").value("Samsung"))
                .andExpect(jsonPath("content[0].price").value(18000000))
                .andExpect(jsonPath("content[0].image").value("img"))
                .andExpect(jsonPath("content[0].camera").value("5 camera"))
                .andExpect(jsonPath("content[0].selfie").value("180pm"))
                .andExpect(jsonPath("content[0].screenSize").value("6.8"))
                .andExpect(jsonPath("content[0].guarantee").value("12 tháng"))
                .andExpect(jsonPath("content[0].origin").value("China"))
                .andExpect(jsonPath("content[0].description").value("màu hồng"))
                .andExpect(jsonPath("content[0].codeQr").value("code"))
                .andExpect(jsonPath("content[0].quantity").value(50))
                .andExpect(jsonPath("content[0].flagDelete").value("false"))

                .andExpect(jsonPath("content[1].name").value("iPhone 14 Pro Max"))
                .andExpect(jsonPath("content[1].cpu").value("Apple A16 Bionic"))
                .andExpect(jsonPath("content[1].capacity").value("128 GB"))
                .andExpect(jsonPath("content[1].trademark").value("Iphone"))
                .andExpect(jsonPath("content[1].price").value(12000000))
                .andExpect(jsonPath("content[1].image").value("img"))
                .andExpect(jsonPath("content[1].camera").value("3 camera"))
                .andExpect(jsonPath("content[1].selfie").value("260pm"))
                .andExpect(jsonPath("content[1].screenSize").value("6.5"))
                .andExpect(jsonPath("content[1].guarantee").value("6 tháng"))
                .andExpect(jsonPath("content[1].origin").value("America"))
                .andExpect(jsonPath("content[1].description").value("màu hồng"))
                .andExpect(jsonPath("content[1].codeQr").value("code 1"))
                .andExpect(jsonPath("content[1].quantity").value(50))
                .andExpect(jsonPath("content[1].flagDelete").value("false"))
        ;
    }


}
