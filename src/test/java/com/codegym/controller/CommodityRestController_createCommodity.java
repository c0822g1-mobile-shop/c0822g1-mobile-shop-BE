package com.codegym.controller;

import com.codegym.dto.CommodityDto;
import com.codegym.model.commodity.Trademark;
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
public class CommodityRestController_createCommodity {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_name_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName(null);
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(8490000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_cpu_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu(null);
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(8490000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_capacity_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity(null);
        commodityDto.setPrice(8490000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_image_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage(null);
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_camera_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera(null);
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_selfie_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie(null);
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_screenSize_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize(null);
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_guarantee_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee(null);
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_origin_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin(null);
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is null
     *
     * @author DanhHD
     * @Time 13h30 28/02/2023
     */
    @Test
    public void createCommodity_codeQr_13() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr(null);
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_name_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_cpu_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_capacity_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("");
        commodityDto.setPrice(10000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_image_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_camera_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_selfie_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_screenSize_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_guarantee_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213");
        commodityDto.setGuarantee("");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_origin_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is empty
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_codeQr_14() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_name_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12@#!");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_cpu_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snapdragon 680@#$!");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_capacity_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB@#$!");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_camera_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123@#$");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_selfie_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123@#$!");
        commodityDto.setScreenSize("123213");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_screenSize_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213 inch @#$!");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_guarantee_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng @#$!");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_origin_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam 12 ");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is containing special character
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_codeQr_15() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123 @#$!");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_name_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iph");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_cpu_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Sna");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("123");
        commodityDto.setSelfie("123");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_capacity_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcabvcbac");
        commodityDto.setCamera("123acbacb");
        commodityDto.setSelfie("123acbcba");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_image_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abc");
        commodityDto.setCamera("12acb3");
        commodityDto.setSelfie("123acbacb");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_camera_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12a");
        commodityDto.setSelfie("123acbacb");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_selfie_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb");
        commodityDto.setScreenSize("123213 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_screenSize_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize(" nch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_guarantee_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_origin_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12");
        commodityDto.setOrigin("Vi");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abc123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *  this function use to test the validation of field name more specific is min length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_codeQR_16() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("ab");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_name_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_cpu_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_capacity_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_image_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_camera_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_selfie_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123  Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_screenSize_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch  Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_guarantee_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_origin_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to test the validation of field name more specific is max length
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_codeQr_17() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("Iphone 12");
        commodityDto.setCpu("Snaavcn 123");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(100000.0);
        commodityDto.setImage("abcacbcab");
        commodityDto.setCamera("12aacvacv");
        commodityDto.setSelfie("bacb123");
        commodityDto.setScreenSize("123 nch");
        commodityDto.setGuarantee("12acvcav");
        commodityDto.setOrigin("Viet Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("abacva Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 Iphone 12 I");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * this function use to create commodity with all valid item
     *
     * @author DanhHD
     * @Time 13:30 28/02/2023
     */
    @Test
    public void createCommodity_18() throws Exception {
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setName("OPPO Reno 7");
        commodityDto.setCpu("Snapdragon 680");
        commodityDto.setCapacity("128 GB");
        commodityDto.setPrice(8490000.0);
        commodityDto.setImage("abcd1234");
        commodityDto.setCamera("54.0 MP");
        commodityDto.setSelfie("32.0 MP");
        commodityDto.setScreenSize("6.4 inch");
        commodityDto.setGuarantee("12 tháng");
        commodityDto.setOrigin("Việt Nam");
        commodityDto.setDescription("abcabc");
        commodityDto.setCodeQr("codeQr123");
        commodityDto.setQuantity(1);
        Trademark trademark = new Trademark();
        trademark.setId(1);
        commodityDto.setTrademark(trademark);

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/commodity/create")
                .content(this.objectMapper.writeValueAsString(commodityDto))
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

}
