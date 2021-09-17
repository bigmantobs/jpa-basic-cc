package no.hvl.dat250.jpa.basicexample;

import javax.persistence.*;
import cc_model.*;


public class Main {
    private static EntityManagerFactory factory;
    private static final String PERSISTENCE_UNIT_NAME = "transactions";

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console

        em.getTransaction().begin();
        Person person = new Person();
        person.setName("Max Mustermann");
        em.persist(person);

        Address address = new Address();
        address.setNumber(28);
        address.setStreet("Inndalsveien");
        em.persist(address);

        CreditCard cc1 = new CreditCard();
        cc1.setLimit(-10000);
        cc1.setNumber(12345);
        cc1.setBalance(-5000);
        em.persist(cc1);

        CreditCard cc2 = new CreditCard();
        cc2.setLimit(2000);
        cc2.setNumber(123);
        cc2.setBalance(1);
        em.persist(cc2);

        PinCode pin = new PinCode();
        pin.setPinCode("123");
        pin.setCount(1);
        em.persist(pin);

        Bank bank = new Bank();
        bank.setName("Pengebank");
        em.persist(bank);
        cc1.setPincode(pin);
        cc2.setPincode(pin);
        cc1.setBank(bank);
        cc2.setBank(bank);
        bank.addCreditCard(cc1);
        bank.addCreditCard(cc2);
        person.addCreditCard(cc1);
        person.addCreditCard(cc2);
        address.addInhabitant(person);
        person.addAddress(address);

        em.getTransaction().commit();
        em.close();


    }
}

