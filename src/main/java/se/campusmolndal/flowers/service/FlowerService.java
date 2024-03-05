package se.campusmolndal.flowers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.campusmolndal.flowers.model.Flower;
import se.campusmolndal.flowers.repository.FlowerRepository;

import java.util.List;
import java.util.Optional;

@Service // Märker klassen som en Spring-tjänst
public class FlowerService {

    private final FlowerRepository flowerRepository;

    @Autowired // Autowired för att injicera beroendet av FlowerRepository
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    // Metod för att lägga till en blomma
    public Flower addFlower(Flower flower) {
        return flowerRepository.save(flower); // Spara blomma i databasen
    }

    // Metod för att hämta alla blommor
    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll(); // Hämta alla blommor
    }

    // Metod för att hitta en blomma med ett specifikt ID
    public Optional<Flower> getFlowerById(Long id) {
        return flowerRepository.findById(id); // Hitta blomma baserat på ID
    }

    // seed multiple flowers
    public List<Flower> seed() {
        List<Flower> flowers = List.of(
                new Flower("Tulip", "Tulipa", "Liliaceae"),
                new Flower("Rose", "Rosa", "Rosaceae"),
                new Flower("Daisy", "Bellis perennis", "Asteraceae"),
                new Flower("Sunflower", "Helianthus annuus", "Asteraceae"),
                new Flower("Lily", "Lilium", "Liliaceae"),
                new Flower("Orchid", "Orchidaceae", "Orchidaceae"),
                new Flower("Daffodil", "Narcissus", "Amaryllidaceae"),
                new Flower("Carnation", "Dianthus caryophyllus", "Caryophyllaceae"),
                new Flower("Chrysanthemum", "Chrysanthemum", "Asteraceae"),
                new Flower("Hyacinth", "Hyacinthus", "Asparagaceae")
        );
        return flowerRepository.saveAll(flowers);
    }

    // Metod för att uppdatera en befintlig blomma
    public Flower updateFlower(Flower flower) {
        return flowerRepository.save(flower); // Uppdatera blomma i databasen
    }

    // Metod för att ta bort en blomma med ett specifikt ID
    public void deleteFlower(Long id) {
        flowerRepository.deleteById(id); // Ta bort blomma baserat på ID
    }
}