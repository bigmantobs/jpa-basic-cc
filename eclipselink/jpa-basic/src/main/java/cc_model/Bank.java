package cc_model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "bank")
    private List<CreditCard> creditCards = new ArrayList<CreditCard>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCreditCard(CreditCard creditCard) {
        this.getCreditCards().add(creditCard);
    }

}


