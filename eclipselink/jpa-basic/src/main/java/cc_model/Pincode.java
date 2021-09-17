package cc_model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pincode {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String pinCode;
    private int count;

    public Long getId() {
        return id;
    }

    public String getPinCode() {
        return pinCode;
    }

    public int getCount() {
        return count;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

