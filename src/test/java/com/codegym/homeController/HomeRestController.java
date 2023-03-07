package com.codegym.homeController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HomeRestController {

    @Autowired
    private MockMvc mockMvc;

    /**
     * get commodity by quantity sold
     * @param: N/A
     * check total elements of page is 20 and total pages is 4
     * check arttribute of element at number 0 in page
     * status expect is 2xxsuccess
     * expected: 4
     * actual: 1 => name
     */

    @Test
    public void getPageCommodityByQuantity_1() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/home/quantity?page=0"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(4))
                .andExpect(jsonPath("totalElements").value(20))
                .andExpect(jsonPath("content[0].name").value("iphone"))
                .andExpect(jsonPath("content[0].camera").value("a"))
                .andExpect(jsonPath("content[0].capacity").value("a"))
                .andExpect(jsonPath("content[0].cpu").value("a"))
                .andExpect(jsonPath("content[0].description").value("a"))
                .andExpect(jsonPath("content[0].image").value("a"))
                .andExpect(jsonPath("content[1].name").value("a"))
        ;
    }


    /**
     * search commodityby name with
     * @param: "a"
     * check total elements of page is 20 and total pages is 4
     * check arttribute of element at number 0 in page
     * status expect is 2xxsuccess
     * expected: 4
     * actual: 1 => description
     */
    @Test
    public void searchCommodityByName_1() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/home/search/{name}&page=0","a"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(4))
                .andExpect(jsonPath("totalElements").value(20))
                .andExpect(jsonPath("content[0].name").value("a"))
                .andExpect(jsonPath("content[0].camera").value("a"))
                .andExpect(jsonPath("content[0].capacity").value("a"))
                .andExpect(jsonPath("content[0].cpu").value("a"))
                .andExpect(jsonPath("content[0].description").value("adad"))
                .andExpect(jsonPath("content[0].image").value("a"))
                .andExpect(jsonPath("content[1].name").value("a"));
    }

    /**
     * search commodityby name with
     * @param: "null"
     * check total elements of page is 50 and total pages is 4
     * check arttribute of element at number 0 in page
     * status expect is 2xxsuccess
     * and get page success
     * content[0] has value
     * expected: 4
     * actual: 1 => description
     */
    @Test
    public void searchCommodityByName_2() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/home/search/{name}&page=0","null"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(4))
                .andExpect(jsonPath("totalElements").value(50))
                .andExpect(jsonPath("content[0].name").value("a"))
                .andExpect(jsonPath("content[0].camera").value("a"))
                .andExpect(jsonPath("content[0].capacity").value("a"))
                .andExpect(jsonPath("content[0].cpu").value("a"))
                .andExpect(jsonPath("content[0].description").value("adad"))
                .andExpect(jsonPath("content[0].image").value("a"))
                .andExpect(jsonPath("content[1].name").value("a"));
    }
    /**
     * search commodityby name with
     * @param: ""
     * check total elements of page is 50 and total pages is 4
     * check arttribute of element at number 0 in page
     * status expect is 2xxsuccess
     * and get page success
     * content[0] has value
     * expected: 4
     * actual: 1 => description
     */
    @Test
    public void searchCommodityByName_3() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/home/search/{name}&page=0",""))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(4))
                .andExpect(jsonPath("totalElements").value(50))
                .andExpect(jsonPath("content[0].name").value("a"))
                .andExpect(jsonPath("content[0].camera").value("a"))
                .andExpect(jsonPath("content[0].capacity").value("a"))
                .andExpect(jsonPath("content[0].cpu").value("a"))
                .andExpect(jsonPath("content[0].description").value("adad"))
                .andExpect(jsonPath("content[0].image").value("a"))
                .andExpect(jsonPath("content[1].name").value("a"));
    }

    /**
     * search commodityby with not has element's name have like "b"
     * @param: "b"
     * check total elements of page is 50 and total pages is 4
     * check arttribute of element at number 0 in page
     * status expect is 4xxClientError
     */
    @Test
    public void searchCommodityByName_4() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/home/search/{name}&page=0","bced"))
                .andDo(print())
                .andExpect(status().is4xxClientError())
                .andExpect(jsonPath("totalPages").value(4))
                .andExpect(jsonPath("totalElements").value(50))
                .andExpect(jsonPath("content[0].name").value("a"))
                .andExpect(jsonPath("content[0].camera").value("a"))
                .andExpect(jsonPath("content[0].capacity").value("a"))
                .andExpect(jsonPath("content[0].cpu").value("a"))
                .andExpect(jsonPath("content[0].description").value("adad"))
                .andExpect(jsonPath("content[0].image").value("a"))
                .andExpect(jsonPath("content[1].name").value("a"));
    }
}
