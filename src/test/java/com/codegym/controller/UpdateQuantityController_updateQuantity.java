package com.codegym.controller;

import com.codegym.dto.WareHousingDto;
import com.codegym.model.commodity.Commodity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UpdateQuantityController_updateQuantity {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void updateQuantity_19() throws Exception {
        WareHousingDto wareHousingDto = new WareHousingDto();
        wareHousingDto.setQuantity(369);



        this.mockMvc.perform(MockMvcRequestBuilders
                        .put("ware-housing")
                        .content(this.objectMapper.writeValueAsString(wareHousingDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());

    }
}
