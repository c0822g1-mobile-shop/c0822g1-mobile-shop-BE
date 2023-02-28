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
public class ScanQRCodeController_scanQRCode {

    @Autowired
    private MockMvc mockMvc;


    /**
     * This function is used to check for products based on QR that are null
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void scanQRCode_1() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/scanQR?QRCode=null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }



    /**
     * This function is used to check for products based on QR that is empty
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void scanQRCode_2() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/scanQR?QRCode="))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function is used to check QR-based products that do not exist in the DB
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void scanQRCode_3() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/scanQR?QRCode=1233321"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     *
     * This function is used to check QR based products exist in DB
     *
     * @author DuongLTH
     * @Date 28/02/2023
     */
    @Test
    public void scanQRCode_4() throws Exception{
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/scanQR?QRCode=123"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}
