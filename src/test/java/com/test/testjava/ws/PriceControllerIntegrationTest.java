package com.test.testjava.ws;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.testjava.constants.Constants;
import com.test.testjava.dto.PriceDTO;
import com.test.testjava.dto.PriceFilterDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void givenRequestWithoutMandatoryDataWhenCheckShouldFailure() throws Exception {
        PriceFilterDTO request = PriceFilterDTO.builder().build();
        MockHttpServletRequestBuilder httpServletRequestBuilder = post("/" + Constants.VERSION + "/price" + "/check")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(objectMapper.writeValueAsString(request));

        mockMvc.perform(httpServletRequestBuilder)
            .andExpect(status().isBadRequest());
    }

    @Test
    public void givenRequestAtDay14Hour10WhenCheckShouldReturn35_50Price() throws Exception {
        PriceFilterDTO request = PriceFilterDTO.builder()
            .brandId((short)1)
            .productId(35455)
            .date(LocalDateTime.of(2020, 06, 14, 10, 0,0))
            .build();
        MockHttpServletRequestBuilder httpServletRequestBuilder = post("/" + Constants.VERSION + "/price" + "/check")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(objectMapper.writeValueAsString(request));

        MvcResult mvcResult = mockMvc.perform(httpServletRequestBuilder)
            .andExpect(status().isOk())
            .andReturn();
        PriceDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PriceDTO.class);
        assertEquals(Double.valueOf("35.50"), response.getPrice());
    }

    @Test
    public void givenRequestAtDay14Hour16WhenCheckShouldReturn25_45Price() throws Exception {
        PriceFilterDTO request = PriceFilterDTO.builder()
            .brandId((short)1)
            .productId(35455)
            .date(LocalDateTime.of(2020, 06, 14, 16, 0,0))
            .build();
        MockHttpServletRequestBuilder httpServletRequestBuilder = post("/" + Constants.VERSION + "/price" + "/check")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(objectMapper.writeValueAsString(request));

        MvcResult mvcResult = mockMvc.perform(httpServletRequestBuilder)
            .andExpect(status().isOk())
            .andReturn();
        PriceDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PriceDTO.class);
        assertEquals(Double.valueOf("25.45"), response.getPrice());
    }

    @Test
    public void givenRequestAtDay14Hour21WhenCheckShouldReturn35_50Price() throws Exception {
        PriceFilterDTO request = PriceFilterDTO.builder()
            .brandId((short)1)
            .productId(35455)
            .date(LocalDateTime.of(2020, 06, 14, 21, 0,0))
            .build();
        MockHttpServletRequestBuilder httpServletRequestBuilder = post("/" + Constants.VERSION + "/price" + "/check")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(objectMapper.writeValueAsString(request));

        MvcResult mvcResult = mockMvc.perform(httpServletRequestBuilder)
            .andExpect(status().isOk())
            .andReturn();
        PriceDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PriceDTO.class);
        assertEquals(Double.valueOf("35.50"), response.getPrice());
    }

    @Test
    public void givenRequestAtDay15Hour10WhenCheckShouldReturn30_50Price() throws Exception {
        PriceFilterDTO request = PriceFilterDTO.builder()
            .brandId((short)1)
            .productId(35455)
            .date(LocalDateTime.of(2020, 06, 15, 10, 0,0))
            .build();
        MockHttpServletRequestBuilder httpServletRequestBuilder = post("/" + Constants.VERSION + "/price" + "/check")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(objectMapper.writeValueAsString(request));

        MvcResult mvcResult = mockMvc.perform(httpServletRequestBuilder)
            .andExpect(status().isOk())
            .andReturn();
        PriceDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PriceDTO.class);
        assertEquals(Double.valueOf("30.50"), response.getPrice());
    }

    @Test
    public void givenRequestAtDay16Hour21WhenCheckShouldReturn38_95Price() throws Exception {
        PriceFilterDTO request = PriceFilterDTO.builder()
            .brandId((short)1)
            .productId(35455)
            .date(LocalDateTime.of(2020, 06, 16, 21, 0,0))
            .build();
        MockHttpServletRequestBuilder httpServletRequestBuilder = post("/" + Constants.VERSION + "/price" + "/check")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(objectMapper.writeValueAsString(request));

        MvcResult mvcResult = mockMvc.perform(httpServletRequestBuilder)
            .andExpect(status().isOk())
            .andReturn();
        PriceDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PriceDTO.class);
        assertEquals(Double.valueOf("38.95"), response.getPrice());
    }

    @Test
    public void givenRequestWithoutDataWhenCheckShouldFailure() throws Exception {
        PriceFilterDTO request = PriceFilterDTO.builder()
            .brandId((short)1)
            .productId(35455)
            .date(LocalDateTime.of(2019, 06, 16, 21, 0,0))
            .build();
        MockHttpServletRequestBuilder httpServletRequestBuilder = post("/" + Constants.VERSION + "/price" + "/check")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(objectMapper.writeValueAsString(request));

        mockMvc.perform(httpServletRequestBuilder)
            .andExpect(status().isNotFound());
    }
}
