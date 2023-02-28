package com.codegym.controller;


import com.codegym.dto.SupplierDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SupplierRestController_updateSupplier {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    public void updateSupplier_name_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName(null);
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976789090");
        supplierDto.setEmail("sonyvn1@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_address_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress(null);
        supplierDto.setPhoneNumber("0976789200");
        supplierDto.setEmail("sonyvn2@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_phoneNumber_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber(null);
        supplierDto.setEmail("sonyvn3@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_email_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976789044");
        supplierDto.setEmail(null);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_name_20() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976799090");
        supplierDto.setEmail("sonyvn11@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_address_20() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress("");
        supplierDto.setPhoneNumber("0976289200");
        supplierDto.setEmail("sonyvn290@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_phoneNumber_20() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("");
        supplierDto.setEmail("sonyvn33@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_email_20() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976700044");
        supplierDto.setEmail("");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_phoneNumber_21() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("098989878");
        supplierDto.setEmail("sonyvn323@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_email_21() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976700004");
        supplierDto.setEmail("sony");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_24() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(1);
        supplierDto.setCode("111111");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976707704");
        supplierDto.setEmail("sonyvvn123@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .put("/supplier/update")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }


}

