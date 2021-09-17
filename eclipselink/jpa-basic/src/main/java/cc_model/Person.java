package cc_model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Person {

    private Long id;
    private String name;


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)

    @OneToMany
    private List<CreditCard> creditCards = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "jnd_Person_Address",
            joinColumns = @JoinColumn(name = "person_fk"),
            inverseJoinColumns = @JoinColumn(name = "address_fk"))
    private List<Address> addresses = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addCreditCard(CreditCard creditCard) {
        this.getCreditCards().add(creditCard);
    }

    public void addAddress(Address address) {
        this.getAddresses().add(address);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    private List<CreditCard> ccList = new ArrayList<CreditCard>();

}

