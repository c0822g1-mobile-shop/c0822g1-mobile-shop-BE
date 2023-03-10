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
public class CustomerRestController_getCustomerById {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getCustomerById_id_1() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity/{id}", "null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getCustomerById_id_2() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity/{id}", ""))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getCustomerById_id_3() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity/{id}", "99"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getCustomerById_id_4() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/commodity/{id}", "3"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful()).andExpectAll(jsonPath("id").value(3),
                        jsonPath("name").value("Nhan"),
                        jsonPath("age").value("20"),
                        jsonPath("address").value("H???i L??ng Qu???ng Tr???"));
    }
}
