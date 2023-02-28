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
public class UserRestController_findAll {
    @Autowired
    private MockMvc mockMvc;

    /**
     * This function use to test list customer of all field search is "null", page = 0
     *
     * @author HuyNL
     * @Date 28/02/2023
     */

    @Test
    public void findAll_7() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list?search=null&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    /**
     * This function use to test list customer of all field search is "", page = 0
     *
     * @author HuyNL
     * @Date 28/02/2023
     */

    @Test
    public void findAll_8() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list?search=&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(3))
                .andExpect(jsonPath("totalElements").value(9))
                .andExpect(jsonPath("content[0].id").value(1))
                .andExpect(jsonPath("content[0].name").value("Huynl4"))
                .andExpect(jsonPath("content[0].username").value("huynl"))
                .andExpect(jsonPath("content[0].password").value("123"))
                .andExpect(jsonPath("content[0].phoneNumber").value("0890206892"))
                .andExpect(jsonPath("content[0].email").value("huynl@gmail.com"))
                .andExpect(jsonPath("content[0].address").value("USA"))
                .andExpect(jsonPath("content[0].age").value(24))
                .andExpect(jsonPath("content[0].gender").value("true"))
                .andExpect(jsonPath("content[0].dateOfBirth").value("1998-02-10"))
                .andExpect(jsonPath("content[1].id").value(2))
                .andExpect(jsonPath("content[1].name").value("Danh20"))
                .andExpect(jsonPath("content[1].username").value("danhhd"))
                .andExpect(jsonPath("content[1].password").value("123"))
                .andExpect(jsonPath("content[1].phoneNumber").value("0890206892"))
                .andExpect(jsonPath("content[1].email").value("huynl@gmail.com"))
                .andExpect(jsonPath("content[1].address").value("Đức"))
                .andExpect(jsonPath("content[1].age").value(20))
                .andExpect(jsonPath("content[1].gender").value("true"))
                .andExpect(jsonPath("content[1].dateOfBirth").value("2000-02-02"));

    }


    /**
     * This function use to test list customer of all field ageSearch is "90", page = 0
     *
     * @author HuyNL
     * @Date 28/02/2023
     */
    @Test
    public void findAll_9() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list?search=90&page=0"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * This function use to test list customer of all field genderSearch is "abc", page = 0
     *
     * @author HuyNL
     * @Date 28/02/2023
     */
    @Test
    public void findAll_9_2() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list?search=abc&page=0"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * This function use to test list customer of all field ageSearch is "20", page = 0
     *
     * @author HuyNL
     * @Date 28/02/2023
     */
    @Test
    public void finAll_11() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/list?search=20&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(1))
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
