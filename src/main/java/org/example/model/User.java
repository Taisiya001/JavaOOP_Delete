package org.example.model;

public class User {
    private String id ="";
    private String firstName;
    private String lastName;
    private String phone;

    public User(String firstName, String lastName, String phone) {
        this.id = "";
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public User(String id, String firstName, String lastName, String phone) {
        this(firstName, lastName, phone);
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return String.format("Идентафикатор: %s\nИмя: %s,\nФамилия: %s,\nТелефон: %s", this.id, this.firstName, this.lastName, this.phone);
    }
}