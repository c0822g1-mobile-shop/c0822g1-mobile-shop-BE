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
public class CustomerRestController_gelAllCustomer {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPageCustomer_name_1() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer", "null"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void getPageCustomer_name_2() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer", ""))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void getPageCustomer_name_3() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer", "222"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getPageCustomer_name_4() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer", "Long"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("content[0].id").value(13))
                .andExpect(jsonPath("content[0].name").value("Thanh Long"))
                .andExpect(jsonPath("content[0].dateOfBirth").value("2004-12-24"));
    }


    @Test
    public void getPageCustomer_address_1() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer", "null"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
    @Test
    public void getPageCustomer_address_2() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer", ""))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void getPageCustomer_address_3() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer", "Singapo"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getPageCustomer_address_4() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer", "Quảng Trị"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("content[0].id").value(13))
                .andExpect(jsonPath("content[0].name").value("Thanh Long"))
                .andExpect(jsonPath("content[0].dateOfBirth").value("2004-12-24"));
    }


    @Test
    public void getPageCustomer_6() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/customer?page=1"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(3))
                .andExpect(jsonPath("totalElements").value(13))
                .andExpect(jsonPath("content[0].name").value("Thanh Long"))
                .andExpect(jsonPath("content[0].dateOfBirth").value("2004-12-24"))
                .andExpect(jsonPath("content[0].age").value(18))
                .andExpect(jsonPath("content[4].name").value("Nhan"))
                .andExpect(jsonPath("content[4].dateOfBirth").value("2005-01-22"))
                .andExpect(jsonPath("content[4].age").value(20));
    }

}
