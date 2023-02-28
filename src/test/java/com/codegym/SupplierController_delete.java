package com.codegym;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SupplierController_delete {
    @Autowired
    private MockMvc mockMvc;

    /**
     * This function use to test delete supplier of id supplier is "null"
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void delete_id_25() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders.delete("/list/{id}", "null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * This function use to test delete supplier of id supplier is ""
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void delete_id_26() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders.delete("/list/{id}", ""))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * This function use to test delete supplier of id supplier is 100
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void delete_id_27() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders.delete("/list/100"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * This function use to test delete supplier of id supplier is 5
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void delete_id_28() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders.delete("/list/5"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

}