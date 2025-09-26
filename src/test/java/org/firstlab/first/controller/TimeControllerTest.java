package org.firstlab.first.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TimeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void timeEndpointReturnsTime() throws Exception {
        mockMvc.perform(get("/api/time"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.time", notNullValue()));
    }
}
