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
public class SupplierRestController_createSupplier {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     *
     * This function is used to check an input code property is null
     */
    @Test
    public void createSupplier_code_13() throws Exception {
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

    /**
     *
     * This function is used to check an input name property is null
     */
    @Test
    public void createSupplier_name_13() throws Exception {
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

    /**
     *
     * This function is used to check an input address property is null
     */
    @Test
    public void createSupplier_address_13() throws Exception {
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


    /**
     *
     * This function is used to check an input phoneNumber property is null
     */
    @Test
    public void createSupplier_phoneNumber_13() throws Exception {
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

    /**
     *
     * This function is used to check an input email property is null
     */
    @Test
    public void createSupplier_email_13() throws Exception {
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


    /**
     *
     * This function is used to check an input code property is empty
     */
    @Test
    public void createSupplier_code_14() throws Exception {
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


    /**
     *
     * This function is used to check an input name property is empty
     */
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


    /**
     *
     * This function is used to check an input address property is empty
     */
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


    /**
     *
     * This function is used to check an input phoneNumber property is empty
     */
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


    /**
     *
     * This function is used to check an input email property is empty
     */
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


    /**
     *
     * This function is used to check an input code property has correct format
     */
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


    /**
     *
     * This function is used to check an input phone property has correct format
     */
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


    /**
     *
     * This function is used to check an input email property has correct format
     */
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


    /**
     *
     * This function is used to check when all input data is correct
     */
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
