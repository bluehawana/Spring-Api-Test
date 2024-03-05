package se.campusmolndal.flowers.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;
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

import java.util.Optional;

@SpringBootTest  // Use this for full application context
@AutoConfigureMockMvc  // Configure MockMvc without starting a full HTTP server
class FlowerControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private FlowerService flowerService;

    @BeforeEach
    public void setup() {
        Flower flower = new Flower(1, "Tulip", "Tulipa", "Liliaceae");
        when(flowerService.getFlowerById(1L)).thenReturn(Optional.of(flower));
    }

    @Test
    void testAddFlower() throws Exception {
        Flower flower = new Flower(2, "Rose", "Rosa", "Rosaceae");
        String flowerJson = objectMapper.writeValueAsString(flower);

        mockMvc.perform(post("/api/flowers/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(flowerJson))
                .andExpect(status().isCreated());
    }

    @Test
    void testGetAllFlowers() throws Exception {
        mockMvc.perform(get("/api/flowers/all"))
                .andExpect(status().isOk());
    }

    @Test
    void testGetFlowerById() throws Exception {
        mockMvc.perform(get("/api/flowers/1"))
                .andExpect(status().isOk());
    }

    @Test
    void testUpdateFlower() throws Exception {
        Flower flowerToUpdate = new Flower(1, "Updated Tulip", "Tulipa", "Liliaceae");
        String flowerJson = objectMapper.writeValueAsString(flowerToUpdate);

        mockMvc.perform(put("/api/flowers/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(flowerJson))
                .andExpect(status().isOk());
    }

    @Test
    void testDeleteFlower() throws Exception {
        mockMvc.perform(delete("/api/flowers/delete/1"))
                .andExpect(status().isOk());
    }
}