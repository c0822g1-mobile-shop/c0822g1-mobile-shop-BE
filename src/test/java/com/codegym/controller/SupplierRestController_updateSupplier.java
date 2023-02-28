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
    public void updateSupplier_code_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode(null);
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976789098");
        supplierDto.setEmail("sonyvn@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_name_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("774912");
        supplierDto.setName(null);
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976789090");
        supplierDto.setEmail("sonyvn1@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_address_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("774913");
        supplierDto.setName("Sony");
        supplierDto.setAddress(null);
        supplierDto.setPhoneNumber("0976789200");
        supplierDto.setEmail("sonyvn2@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_phoneNumber_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("774914");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber(null);
        supplierDto.setEmail("sonyvn3@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_email_19() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("774914");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976789044");
        supplierDto.setEmail(null);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateSupplier_code_20() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0876789098");
        supplierDto.setEmail("sonyvnv@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createSupplier_name_14() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("704912");
        supplierDto.setName("");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976799090");
        supplierDto.setEmail("sonyvn11@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createSupplier_address_14() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("778913");
        supplierDto.setName("Sony");
        supplierDto.setAddress("");
        supplierDto.setPhoneNumber("0976289200");
        supplierDto.setEmail("sonyvn290@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createSupplier_phoneNumber_14() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("774904");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("");
        supplierDto.setEmail("sonyvn33@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createSupplier_email_14() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("700914");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976700044");
        supplierDto.setEmail("");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createSupplier_code_15() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("abc000");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0876000098");
        supplierDto.setEmail("sonyvv@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createSupplier_phoneNumber_15() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("700004");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("098989878");
        supplierDto.setEmail("sonyvn323@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createSupplier_email_15() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("700944");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976700004");
        supplierDto.setEmail("sony");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createSupplier_18() throws Exception {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setCode("711944");
        supplierDto.setName("Sony");
        supplierDto.setAddress("Bắc Giang");
        supplierDto.setPhoneNumber("0976708804");
        supplierDto.setEmail("sonyvn123@gmail.com");

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/supplier/add")
                        .content(this.objectMapper.writeValueAsString(supplierDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }


}

