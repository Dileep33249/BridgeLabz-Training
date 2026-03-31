package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    Map<String, ContactDetails> contacts = new HashMap<>();

    public void addContact(Scanner sc) {
        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();

        if (contacts.containsKey(phoneNumber)) {
            System.out.println("Contact with this phone number already exists.");
            return;
        }

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        // Check duplicate by name
        for (ContactDetails c : contacts.values()) {
            if (c.firstName.equalsIgnoreCase(firstName) && c.lastName.equalsIgnoreCase(lastName)) {
                System.out.println("Duplicate contact exists in this Address Book.");
                return;
            }
        }

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter Zip Code: ");
        String zip = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        ContactDetails person = new ContactDetails(firstName, lastName, city, email, zip, state, address);
        contacts.put(phoneNumber, person);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
            return;
        }
        for (Map.Entry<String, ContactDetails> entry : contacts.entrySet()) {
            String phone = entry.getKey();
            ContactDetails p = entry.getValue();
            System.out.println(p.firstName + " " + p.lastName + ", " + p.address + ", " + p.city + ", " + p.state + ", " + p.zip + ", " + p.email + ", Phone: " + phone);
        }
    }

    public void editContact(Scanner sc) {
        System.out.print("Enter Phone Number to Edit: ");
        String phone = sc.nextLine();
        ContactDetails person = contacts.get(phone);
        if (person == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("New Address: ");
        person.address = sc.nextLine();

        System.out.print("New City: ");
        person.city = sc.nextLine();

        System.out.print("New State: ");
        person.state = sc.nextLine();

        System.out.print("New Email: ");
        person.email = sc.nextLine();

        System.out.println("Contact updated successfully.");
    }

    public void deleteContact(Scanner sc) {
        System.out.print("Enter Phone Number to Delete: ");
        String phone = sc.nextLine();
        if (contacts.remove(phone) != null) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchByCityOrState(String location, boolean isCity) {
        boolean found = false;
        for (Map.Entry<String, ContactDetails> entry : contacts.entrySet()) {
            ContactDetails p = entry.getValue();
            if ((isCity && p.city.equalsIgnoreCase(location)) || (!isCity && p.state.equalsIgnoreCase(location))) {
                System.out.println(p.firstName + " " + p.lastName + ", " + p.address + ", " + p.city + ", " + p.state + ", " + p.zip + ", " + p.email + ", Phone: " + entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found in " + location);
        }
    }
}
