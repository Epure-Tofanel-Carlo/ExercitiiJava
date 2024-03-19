package model;

public class Person {

    private String nume;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String nume, String phoneNumber, String email) {
        this.nume = nume;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


}
