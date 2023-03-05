package com.codegym;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SupplierController_showList {
    @Autowired
    private MockMvc mockMvc;

    /**
     * This function use to test list supplier of all field search is "null", page = 0
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void showList_7() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=null&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    /**
     * This function use to test list supplier of all field search is "", page = 0
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void showList_8() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(3))
                .andExpect(jsonPath("totalElements").value(9))
                .andExpect(jsonPath("content[0].id").value(2))
                .andExpect(jsonPath("content[0].code").value("201607"))
                .andExpect(jsonPath("content[0].name").value("Công Ty Cổ Phần Trung Hiếu"))
                .andExpect(jsonPath("content[0].address").value("Hà Nội"))
                .andExpect(jsonPath("content[0].phoneNumber").value("(04 ) 365016"))
                .andExpect(jsonPath("content[0].email").value("trunghieufashion@yahoo.com"))
                .andExpect(jsonPath("content[2].id").value(6))
                .andExpect(jsonPath("content[2].code").value("201609"))
                .andExpect(jsonPath("content[2].name").value("Công Ty Đầu Tư May Mặc Hoàng"))
                .andExpect(jsonPath("content[2].address").value("Bình Dương"))
                .andExpect(jsonPath("content[2].phoneNumber").value("0972228227"))
                .andExpect(jsonPath("content[2].email").value("hoanghuonghh897@gmail.com"))
        ;
    }

    /**
     * This function use to test list supplier of all field search is "6677778", page = 0
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void showList_9() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=6677778&page=0"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * This function use to test list supplier of all field search is "99" but flag_delete = true
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void showList_10() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=99&page=0"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    /**
     * This function use to test list supplier of all field search is "ha", page = 0
     *
     * @author DiemTTT
     * @Date 28/02/2023
     */

    @Test
    public void showList_11() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=ha&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(1))
                .andExpect(jsonPath("totalElements").value(2))
                .andExpect(jsonPath("content[0].id").value(2))
                .andExpect(jsonPath("content[0].code").value("201607"))
                .andExpect(jsonPath("content[0].name").value("Công Ty Cổ Phần Trung Hiếu"))
                .andExpect(jsonPath("content[0].address").value("Hà Nội"))
                .andExpect(jsonPath("content[0].phoneNumber").value("(04 ) 365016"))
                .andExpect(jsonPath("content[0].email").value("trunghieufashion@yahoo.com"))
                .andExpect(jsonPath("content[1].id").value(13))
                .andExpect(jsonPath("content[1].code").value("201614"))
                .andExpect(jsonPath("content[1].name").value("Cơ sở BMT"))
                .andExpect(jsonPath("content[1].address").value("Hà Nội"))
                .andExpect(jsonPath("content[1].phoneNumber").value("(08 ) 121212"))
                .andExpect(jsonPath("content[1].email").value("bmt2121222@gmail.com"))
        ;
    }
}
