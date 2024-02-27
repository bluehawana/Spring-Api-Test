package se.campusmolndal.flowers.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import se.campusmolndal.flowers.model.Flower;
import se.campusmolndal.flowers.service.FlowerService;

@SpringBootTest  // Använd denna för fullständig applikationskontext
@AutoConfigureMockMvc  // Konfigurera MockMvc utan att behöva starta en fullständig HTTP-server
class FlowerControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FlowerService flowerService;

    private Flower flower;

    @BeforeEach
    public void setup() {
        fail("Not implemented yet");
    }

    @Test
    void testAddFlower() throws Exception {
        fail("Not implemented yet");
    }

    @Test
    void testGetAllFlowers() throws Exception {
        fail("Not implemented yet");
    }

    @Test
    void testGetFlowerById() throws Exception {
        fail("Not implemented yet");
    }

    @Test
    void testUpdateFlower() throws Exception {
        fail("Not implemented yet");
    }

    @Test
    void testDeleteFlower() throws Exception {
        fail("Not implemented yet");
    }

}
