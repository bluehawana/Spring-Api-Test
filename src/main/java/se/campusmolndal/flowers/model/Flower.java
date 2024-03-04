package se.campusmolndal.flowers.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Märker klassen som en entitet för JPA
public class Flower {

    @Id // Primärnyckel
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-genererad ID
    private Long id;

    private String name; // Blommans namn
    private String latinName; // Blommans latinska namn
    private String family; // Blommans familj

    // Standardkonstruktor krävs av JPA
    public Flower() {
    }

    // Konstruktor med parametrar
    public Flower(String name, String latinName, String family) {
        this.name = name;
        this.latinName = latinName;
        this.family = family;
    }

    public Flower(long id, String name, String latinName, String family) {
        this.id = id;
        this.name = name;
        this.latinName = latinName;
        this.family = family;
    }


    // Getters och Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    // toString-metod för enkel utskrift och felsökning
    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latinName='" + latinName + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

}