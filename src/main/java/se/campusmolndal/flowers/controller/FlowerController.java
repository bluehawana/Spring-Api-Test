package se.campusmolndal.flowers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.campusmolndal.flowers.model.Flower;
import se.campusmolndal.flowers.service.FlowerService;

import java.util.List;

@RestController // Märker klassen som en Rest Controller
@RequestMapping("/api/flowers") // Grundläggande URL för alla endpoints i denna kontroller
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired // Injicerar FlowerService
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    // Endpoint för att lägga till en ny blomma
    @PostMapping("/add")
    public ResponseEntity<Flower> addFlower(@RequestBody Flower flower) {
        Flower newFlower = flowerService.addFlower(flower);
        return new ResponseEntity<>(newFlower, HttpStatus.CREATED);
    }

    // Endpoint för att hämta alla blommor
    @GetMapping("/all")
    public ResponseEntity<List<Flower>> getAllFlowers() {
        List<Flower> flowers = flowerService.getAllFlowers();
        return new ResponseEntity<>(flowers, HttpStatus.OK);
    }

    // Endpoint för att hämta en blomma med specifikt ID
    @GetMapping("/{id}")
    public ResponseEntity<Flower> getFlowerById(@PathVariable Long id) {
        return flowerService.getFlowerById(id)
                .map(flower -> new ResponseEntity<>(flower, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint för att uppdatera en befintlig blomma
    @PutMapping("/update")
    public ResponseEntity<Flower> updateFlower(@RequestBody Flower flower) {
        Flower updatedFlower = flowerService.updateFlower(flower);
        return new ResponseEntity<>(updatedFlower, HttpStatus.OK);
    }

    // Endpoint för att ta bort en blomma med specifikt ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFlower(@PathVariable Long id) {
        flowerService.deleteFlower(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}