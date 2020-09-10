package br.com.unicesumar.models;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String charge;

    public User(){}

    public User(Integer id, String name, String email, String charge) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charge = charge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", charge='" + charge + '\'' +
                '}';
    }
}
