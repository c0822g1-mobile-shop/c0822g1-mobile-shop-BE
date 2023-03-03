package com.codegym.controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class FindSupplierController_findSupplier {
    @Autowired
    private MockMvc mockMvc;


    /**
     * This function use to test list supplier of all field search is "null", page = 0
     *
     * @author TanTH
     * @Date 28/02/2023
     */


    @Test
    public void showLists_7() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=null&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }


    /**
     * This function use to test list supplier of all field search is "", page = 0
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void showLists_8() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(2))
                .andExpect(jsonPath("totalElements").value(3))
                .andExpect(jsonPath("content[0].id").value(1))
                .andExpect(jsonPath("content[0].code").value("123"))
                .andExpect(jsonPath("content[0].name").value("Iphone"))
                .andExpect(jsonPath("content[0].address").value("hà tĩnh"))
                .andExpect(jsonPath("content[0].phoneNumber").value("0938941024"))
                .andExpect(jsonPath("content[0].email").value("tan@gmail.com"))
                .andExpect(jsonPath("content[1].id").value(2))
                .andExpect(jsonPath("content[1].code").value("4655"))
                .andExpect(jsonPath("content[1].name").value("Iphone"))
                .andExpect(jsonPath("content[1].address").value("hà tĩnh"))
                .andExpect(jsonPath("content[1].phoneNumber").value("0938941024"))
                .andExpect(jsonPath("content[1].email").value("tan@gmail.com"))
        ;
    }

    /**
     * This function use to test list supplier of all field search is "595458", page = 0
     *
     * @author Tan TH
     * @Date 28/02/2023
     */

    @Test
    public void showLists_9() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=595458&page=0"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * This function use to test list supplier of all field search is "90"
     *
     * @author Tan TH
     * @Date 28/02/2023
     */

    @Test
    public void showLists_10() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=90&page=0"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function use to test list supplier of all field search is "Iphone", page = 0
     *
     * @author Tan TH
     * @Date 28/02/2023
     */

    @Test
    public void showLists_11() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=Iphone&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(2))
                .andExpect(jsonPath("totalElements").value(3))
                .andExpect(jsonPath("content[0].id").value(1))
                .andExpect(jsonPath("content[0].code").value("123"))
                .andExpect(jsonPath("content[0].name").value("Iphone"))
                .andExpect(jsonPath("content[0].address").value("hà tĩnh"))
                .andExpect(jsonPath("content[0].phoneNumber").value("0938941024"))
                .andExpect(jsonPath("content[0].email").value("tan@gmail.com"))
                .andExpect(jsonPath("content[1].id").value(2))
                .andExpect(jsonPath("content[1].code").value("4655"))
                .andExpect(jsonPath("content[1].name").value("Iphone"))
                .andExpect(jsonPath("content[1].address").value("hà tĩnh"))
                .andExpect(jsonPath("content[1].phoneNumber").value("0938941024"))
                .andExpect(jsonPath("content[1].email").value("tan@gmail.com"))
        ;
    }
}