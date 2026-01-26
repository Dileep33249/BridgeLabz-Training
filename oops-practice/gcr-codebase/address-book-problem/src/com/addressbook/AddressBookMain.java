package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    Map<String, AddressBook> addressBooks = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n1. Add Address Book\n2. Add Contact\n3. Display All Contacts\n4. Edit Contact\n5. Delete Contact\n6. Search by City\n7. Search by State\n8. Exit");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    addContactToAddressBook();
                    break;
                case 3:
                    displayAllContacts();
                    break;
                case 4:
                    editContactInAddressBook();
                    break;
                case 5:
                    deleteContactInAddressBook();
                    break;
                case 6:
                    searchByCityOrState(true);
                    break;
                case 7:
                    searchByCityOrState(false);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    private void addAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        if (addressBooks.containsKey(name)) {
            System.out.println("Address Book already exists.");
            return;
        }
        addressBooks.put(name, new AddressBook());
        System.out.println("Address Book added successfully.");
    }

    private AddressBook selectAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        AddressBook book = addressBooks.get(name);
        if (book == null) {
            System.out.println("Address Book not found.");
        }
        return book;
    }

    private void addContactToAddressBook() {
        AddressBook book = selectAddressBook();
        if (book != null) {
            book.addContact(sc);
        }
    }

    private void displayAllContacts() {
        for (Map.Entry<String, AddressBook> entry : addressBooks.entrySet()) {
            System.out.println("\nAddress Book: " + entry.getKey());
            entry.getValue().displayContacts();
        }
    }

    private void editContactInAddressBook() {
        AddressBook book = selectAddressBook();
        if (book != null) {
            book.editContact(sc);
        }
    }

    private void deleteContactInAddressBook() {
        AddressBook book = selectAddressBook();
        if (book != null) {
            book.deleteContact(sc);
        }
    }

    private void searchByCityOrState(boolean isCity) {
        System.out.print("Enter " + (isCity ? "City: " : "State: "));
        String location = sc.nextLine();
        boolean found = false;
        for (Map.Entry<String, AddressBook> entry : addressBooks.entrySet()) {
            System.out.println("\nAddress Book: " + entry.getKey());
            entry.getValue().searchByCityOrState(location, isCity);
        }
    }

    public static void main(String[] args) {
    	AddressBookMain start= new AddressBookMain();
        start.start();
    }
}
