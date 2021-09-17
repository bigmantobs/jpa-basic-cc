package cc_model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String street;
    private int number;

    @ManyToMany(mappedBy = "addresses")
    private List<Person> inhabitants = new ArrayList<Person>();

    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public List<Person> getInhabitants() {
        return inhabitants;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setInhabitants(List<Person> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void addInhabitants(Person person) {
        this.inhabitants.add(person);
    }

}

