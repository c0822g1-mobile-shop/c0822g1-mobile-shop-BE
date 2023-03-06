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
    /**
     * this function use to test the validation of field name more specific is not null
     *
     * @author Tan TH
     * 28/02/2023
     */
    @Test
    public void updateQuantity_19() throws Exception {
        WareHousingDto wareHousingDto = new WareHousingDto();
        wareHousingDto.setQuantity(369);
        Commodity commodity = new Commodity();
        commodity.setId(1);
        wareHousingDto.setCommodity(commodity);

        this.mockMvc.perform(MockMvcRequestBuilders
                        .put("/ware-housing")
                        .content(this.objectMapper.writeValueAsString(wareHousingDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());

    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author Tan TH
     * 28/02/2023
     */

    @Test
    public void updateQuantity_20() throws Exception {
        WareHousingDto wareHousingDto = new WareHousingDto();
        wareHousingDto.setQuantity(369);
        Commodity commodity = new Commodity();
        commodity.setId(1);
        wareHousingDto.setCommodity(commodity);

        this.mockMvc.perform(MockMvcRequestBuilders
                        .put("/ware-housing")
                        .content(this.objectMapper.writeValueAsString(wareHousingDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());

    }
    /**
     * this function use to test the validation of field name more specific is min length
     *
     * @author Tan TH
     * 28/02/2023
     */
    @Test
    public void updateQuantity_22() throws Exception {
        WareHousingDto wareHousingDto = new WareHousingDto();
        wareHousingDto.setQuantity(36);
        Commodity commodity = new Commodity();
        commodity.setId(1);
        wareHousingDto.setCommodity(commodity);

        this.mockMvc.perform(MockMvcRequestBuilders
                        .put("/ware-housing")
                        .content(this.objectMapper.writeValueAsString(wareHousingDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());

    }
    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author Tan TH
     * 28/02/2023
     */
    @Test
    public void updateQuantity_23() throws Exception {
        WareHousingDto wareHousingDto = new WareHousingDto();
        wareHousingDto.setQuantity(361235646);
        Commodity commodity = new Commodity();
        commodity.setId(1);
        wareHousingDto.setCommodity(commodity);

        this.mockMvc.perform(MockMvcRequestBuilders
                        .put("/ware-housing")
                        .content(this.objectMapper.writeValueAsString(wareHousingDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());

    }
    /**
     *  this function use to edit commodity with all valid item
     *
     * @author Tan TH
     * 28/02/2023
     */

    @Test
    public void updateQuantity_24() throws Exception {
        WareHousingDto wareHousingDto = new WareHousingDto();
        wareHousingDto.setQuantity(369);
        Commodity commodity = new Commodity();
        commodity.setId(1);
        wareHousingDto.setCommodity(commodity);

        this.mockMvc.perform(MockMvcRequestBuilders
                        .put("/ware-housing")
                        .content(this.objectMapper.writeValueAsString(wareHousingDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());

    }
}
