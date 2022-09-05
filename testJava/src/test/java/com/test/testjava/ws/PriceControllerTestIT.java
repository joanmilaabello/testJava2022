package com.test.testjava.ws;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.testjava.constants.Constants;
import com.test.testjava.dto.PriceFilterDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerTestIT {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void checkShouldFailureWithoutMandatoryRequestData() throws Exception {
        PriceFilterDTO request = PriceFilterDTO.builder().build();
        MockHttpServletRequestBuilder httpServletRequestBuilder = post("/" + Constants.VERSION + "/price" + "/check")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(objectMapper.writeValueAsString(request));

        mockMvc.perform(httpServletRequestBuilder)
            .andExpect(model().hasErrors());
    }
}
