package com.addressbook;

import java.util.Objects;

public class ContactDetails {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String email;

    public ContactDetails(String firstName, String lastName, String city, String email, String zip, String state, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zip = zip;
        this.email = email;
        this.state = state;
        this.city = city;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactDetails)) return false;
        ContactDetails that = (ContactDetails) o;
        return firstName.equalsIgnoreCase(that.firstName) && lastName.equalsIgnoreCase(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }
}
