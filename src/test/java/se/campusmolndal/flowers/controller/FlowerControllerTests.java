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
        Flower flower = new Flower(1, "Tulip", "Tulipa", "Liliaceae");
    }

    @Test
    void testAddFlower() throws Exception{
        mockMvc.perform(post("/api/flowers/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(flower)))
                .andExpect(status().isCreated());
    }

    @Test
    void testGetAllFlowers() throws Exception {
        this.flower = new Flower(1, "Tulip", "Tulipa", "Liliaceae");
        mockMvc.perform(get("/api/flowers/all"))
                .andExpect(status().isOk());
    }

    @Test
    void testGetFlowerById() throws Exception {
        Flower flower = new Flower(1, "Tulip", "Tulipa", "Liliaceae");
        when(flowerService.getFlowerById(1L)).thenReturn(Optional.of(flower));
        mockMvc.perform(get("/api/flowers/1"))
                .andExpect(status().isOk());
    }

    @Test
    void testUpdateFlower() throws Exception {
        this.flower = new Flower(1, "Tulip", "Tulipa", "Liliaceae");
        when(flowerService.updateFlower(flower)).thenReturn(flower);
        mockMvc.perform(put("/api/flowers/update")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(flower)))
                .andExpect(status().isOk());

    }

    @Test
    void testDeleteFlower() throws Exception {
        this.flower = new Flower(1, "Tulip", "Tulipa", "Liliaceae");
        mockMvc.perform(delete("/api/flowers/delete/1"))
                .andExpect(status().isOk());
    }

}
