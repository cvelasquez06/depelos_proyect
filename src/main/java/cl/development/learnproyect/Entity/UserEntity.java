package cl.development.learnproyect.Entity;

/**
 * Created by servidor on 25/05/2017.
 */

public class UserEntity {
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String password;
    private String imei;
    private boolean customer;
    private boolean hairdresser;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getCustomer() {
        return customer;
    }

    public void setCustomer(boolean customer) {
        this.customer = customer;
    }

    public boolean getHairdresser() {
        return hairdresser;
    }

    public void setHairdresser(boolean hairdresser) {
        this.hairdresser = hairdresser;
    }
}
