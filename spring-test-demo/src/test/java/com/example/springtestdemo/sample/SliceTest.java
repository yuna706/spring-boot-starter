package com.example.springtestdemo.sample;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * SliceControllerTest.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.17
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(SampleController.class)
public class SliceTest {

    @Rule
    public OutputCaptureRule outputCaptureRule = new OutputCaptureRule();

    @MockBean
    SampleService mockSampleService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void helloSlice() throws Exception {
        when(mockSampleService.getName()).thenReturn("yuna lee");

        mockMvc.perform(get("/hello")).andExpect(content().string("hello yuna lee"));

        assertThat(outputCaptureRule.toString())
                .contains("yuna lee");
    }
}
