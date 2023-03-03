package com.codegym.controller;

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
public class CommodityRestController_delete {
    @Autowired
    private MockMvc mockMvc;
    /**
     * This function use to test delete commodity of id commodity is null
     *
     * @author CongBD
     * @Date 28/02/2023
     */


    @Test
    public void delete_id_25() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders.delete("/commodity/delete/{id}", "null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * This function use to test delete commodity of id commodity is empty
     *
     * @author CongBD
     * @Date 28/02/2023
     */

    @Test
    public void delete_id_26() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders.delete("/commodity/delete/{id}", ""))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * This function use to test delete commodity of id commodity is not in database
     *
     * @author CongBD
     * @Date 28/02/2023
     */

    @Test
    public void delete_id_27() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders.delete("/commodity/delete/100"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    /**
     * This function use to test delete commodity of id commodity is included in database
     *
     * @author CongBD
     * @Date 28/02/2023
     */

    @Test
    public void delete_id_28() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders.delete("/commodity/delete/1"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

}
