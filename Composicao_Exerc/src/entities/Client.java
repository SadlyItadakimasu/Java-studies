package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import static entities.Order.sdf1;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client: " + name +
                " (" + sdf1.format(birthDate) +
                ") - " + email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
}
