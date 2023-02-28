package com.example.mobiledemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class BillHistoryRestController_findAll {
    @Autowired
    private MockMvc mockMvc;

    /**
     * This function use to test list customer of all field id is "null"
     *
     * @author HuyNL
     * @Date 28/02/2023
     */

    @Test
    public void findAll_1() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list/{null}"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * This function use to test list billHistory of all field id is  ""
     *
     * @author HuyNL
     * @Date 28/02/2023
     */

    @Test
    public void findAll_2() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list/{}"))
                .andDo(print())
                .andExpect(status().is4xxClientError());


    }

    /**
     * This function use to test list billHistory of all field id is "5"
     *
     * @author HuyNL
     * @Date 28/02/2023
     */

    @Test
    public void findAll_3() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list/{5}"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * This function use to test list billHistory of all field id is "2"
     *
     * @author HuyNL
     * @Date 28/02/2023
     */

    @Test
    public void findAll_4() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list/{2}"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalElements").value(1))
                .andExpect(jsonPath("content[0].id").value(2))
                .andExpect(jsonPath("content[0].name").value("Danh20"))
                .andExpect(jsonPath("content[0].username").value("danhhd"))
                .andExpect(jsonPath("content[0].password").value("123"))
                .andExpect(jsonPath("content[0].phoneNumber").value("0890206892"))
                .andExpect(jsonPath("content[0].email").value("huynl@gmail.com"))
                .andExpect(jsonPath("content[0].address").value("Đức"))
                .andExpect(jsonPath("content[0].age").value(20))
                .andExpect(jsonPath("content[0].gender").value("true"))
                .andExpect(jsonPath("content[0].dateOfBirth").value("2000-02-02"));
    }
}
