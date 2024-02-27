package se.campusmolndal.flowers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.campusmolndal.flowers.model.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
    // Spring Data JPA tillhandahåller CRUD-operationer utan ytterligare kod
    // Här kan du lägga till egna metoddefinitioner om du behöver anpassade frågor
}