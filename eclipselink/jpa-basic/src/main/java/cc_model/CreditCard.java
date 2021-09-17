package cc_model;
import javax.persistence.*;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int number;
    private int limit;
    private int balance;

    @OneToOne
    private Pincode pincode;
    private Bank bank;

    public int getNumber() {
        return number;
    }

    public int getLimit() {
        return limit;
    }

    public int getBalance() {
        return balance;
    }

    public Pincode getPincode() {
        return pincode;
    }

    public Bank getBank() {
        return bank;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
