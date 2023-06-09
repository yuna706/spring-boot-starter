package com.example.springbootsecurity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * HomeContollerTest.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.05.03
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HomeContoller.class)
public class HomeContollerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    @WithMockUser
    public void hello() throws Exception {
        mockMvc.perform(get("/hello")
                        .accept(MediaType.TEXT_HTML))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("hello"));
    }

    @Test
    public void helloWithoutUser() throws Exception {
        mockMvc.perform(get("/hello")
                        .accept(MediaType.TEXT_HTML))
                .andDo(print())
                .andExpect(view().name("hello"));
    }

    @Test
    @WithMockUser
    public void my() throws Exception {
        mockMvc.perform(get("/my"))
                .andDo(print())
                 .andExpect(status().isOk())
                .andExpect(view().name("my"));
    }
}