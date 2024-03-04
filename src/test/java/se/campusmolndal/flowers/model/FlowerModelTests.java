package se.campusmolndal.flowers.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import se.campusmolndal.flowers.model.Flower;

public class FlowerModelTests {

    @Test
    public void testFlowerCreation() {

        Flower flower = new Flower("Tulip", "Tulipa", "Liliaceae");
        assertEquals("Tulip", flower.getName());
        assertEquals("Tulipa", flower.getLatinName());
        assertEquals("Liliaceae", flower.getFamily());
    }

    @Test
    public void testFlowerSetters() {
        Flower flower = new Flower();
        flower.setId(1L);
        flower.setName("Tulip");
        flower.setLatinName("Tulipa");
        flower.setFamily("Liliaceae");

        assertEquals(1L, flower.getId());
        assertEquals("Tulip", flower.getName());
        assertEquals("Tulipa", flower.getLatinName());
        assertEquals("Liliaceae", flower.getFamily());
    }
}
