package com.codegym;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class WareHousingController_wareHousing {
    @Autowired
    private MockMvc mockMvc;


    /**
     * This function use to test list supplier of all field search is "null", page = 0
     *
     * @author TanTH
     * @Date 28/02/2023
     */


    @Test
    public void showList_7() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/list?search=null&page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    

}
