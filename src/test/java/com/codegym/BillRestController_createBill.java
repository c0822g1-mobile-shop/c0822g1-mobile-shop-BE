package com.codegym;

import com.codegym.dto.BillDto;
import com.codegym.model.user.User;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.fasterxml.jackson.core.JsonProcessingException;

@SpringBootTest
@AutoConfigureMockMvc
public class BillRestController_createBill {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     *
     * this function use to test the validation of paymentMethod field more specific is null
     * Author: HocHH
     */

    @Test
    public void createBill_paymentMethod_13() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod(null);

        User user = new User();
        user.setName(null);
        user.setPhoneNumber("0905214365");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of name field more specific is null
     * Author: HocHH
     */
    @Test
    public void createBill_name_13() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName(null);
        user.setPhoneNumber("0905214365");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of phoneNumber field more specific is null
     * Author: HocHH
     */
    @Test
    public void createBill_phoneNumber_13() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("Nguyễn Anh Dũng");
        user.setPhoneNumber(null);
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of address field more specific is null
     * Author: HocHH
     */
    @Test
    public void createBill_address_13() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("Nguyễn Anh Dũng");
        user.setPhoneNumber("0905214365");
        user.setAddress(null);
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of age field more specific is null
     * Author: HocHH
     */
    @Test
    public void createBill_age_13() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("Nguyễn Anh Dũng");
        user.setPhoneNumber("0905214365");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(null);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of email field more specific is null
     * Author: HocHH
     */
    @Test
    public void createBill_email_13() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("Nguyễn Anh Dũng");
        user.setPhoneNumber("0905214365");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail(null);

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of paymentMethod field more specific is empty
     * Author: HocHH
     */
    @Test
    public void createBill_paymentMethod_14() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("");

        User user = new User();
        user.setName(null);
        user.setPhoneNumber("0905214365");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of name field more specific is empty
     * Author: HocHH
     */
    @Test
    public void createBill_name_14() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("");
        user.setPhoneNumber("0905214365");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of phoneNumber field more specific is empty
     * Author: HocHH
     */
    @Test
    public void createBill_phoneNumber_14() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("Nguyễn Anh Dũng");
        user.setPhoneNumber("");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of address field more specific is empty
     * Author: HocHH
     */
    @Test
    public void createBill_address_14() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("Nguyễn Anh Dũng");
        user.setPhoneNumber("0905214365");
        user.setAddress("");
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     *
     * this function use to test the validation of email field more specific is empty
     * Author: HocHH
     */
    @Test
    public void createBill_email_14() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("Nguyễn Anh Dũng");
        user.setPhoneNumber("0905214365");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail("");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }



    /**
     *
     * This function is used to check when all input data is correct
     * Author: HocHH
     */
    @Test
    public void createBill_18() throws Exception {
        BillDto billDto = new BillDto();
        billDto.setPaymentMethod("Thẻ tín dụng");

        User user = new User();
        user.setName("Nguyễn Anh Dũng");
        user.setPhoneNumber("0905214365");
        user.setAddress("21 Thanh Mai, Hà Nội");
        user.setAge(37);
        user.setEmail("dungct@gmail.com");

        this.mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/bill/save")
                        .content(this.objectMapper.writeValueAsString(billDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }


}
