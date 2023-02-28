package com.codegym;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.JsonPath;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SalesReportController_salesReport {
    @Autowired
    private MockMvc mockMvc;

    /**
     * This function is used to check the sales report of all parameters is null
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void salesReport_1() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/salesReport?startDay=null&endDay=null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function is used to check startDay sales report is null
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void salesReport_startDay_1() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/salesReport?startDay=null&endDay=2023-02-02"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function is used to check endDay sales report is null
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void salesReport_endDay_1() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/salesReport?startDay=2023-02-02&endDay=null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }



    /**
     * This function is used to check the sales report of all parameters is empty
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void salesReport_2() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/salesReport?startDay=&endDay="))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function is used to check startDay sales report is empty
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void salesReport_startDay_2() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/salesReport?startDay=&endDay=2023-02-02"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function is used to check endDay sales report is empty
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void salesReport_endDay_2() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/salesReport?startDay=2023-02-02&endDay="))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function is used to check the sales report of startDay greater than endDay(data does not exist in DB)
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void salesReport_3() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/salesReport?startDay=2023-02-02&endDay=2020-02-02"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function is used to check the sales report of all parameters are correct
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void salesReport_4() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/salesReport?startDay=2022-02-02&endDay=2024-02-02"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("content[0].revenue").value(170000000))
                .andExpect(jsonPath("content[0].totalQuantity").value(9));
    }

}
