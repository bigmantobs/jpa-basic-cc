package cc_model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

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

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
