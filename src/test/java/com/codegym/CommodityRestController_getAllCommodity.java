package com.codegym;

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
public class CommodityRestController_getAllCommodity {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPageCommodity_name_1() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity", "null"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void getPageCommodity_name_2() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity", ""))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void getPageCommodity_name_3() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity", "SSSS"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getPageCommodity_name_4() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity", "IPhone 12"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("content[0].name").value("IPhone 12"))
                .andExpect(jsonPath("content[0].cpu").value("AP S15"))
                .andExpect(jsonPath("content[0].price").value(15000000));
    }

    @Test
    public void getPageCommodity_6() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity?page=1"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(2))
                .andExpect(jsonPath("totalElements").value(9))
                .andExpect(jsonPath("content[0].name").value("IPhone 12"))
                .andExpect(jsonPath("content[0].cpu").value("AP S15"))
                .andExpect(jsonPath("content[0].price").value(15000000));
    }
}
