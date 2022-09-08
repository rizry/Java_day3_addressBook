package com.java.day9;

import java.util.Scanner;

public class Contact {
  String fName, lName, address, city, state, email;
  int zip;
  long phNum;

  Scanner sc = new Scanner(System.in);

  void getInputs() {
    System.out.print("Enter your first name: ");
    fName = sc.nextLine();

    System.out.print("Enter your last name: ");
    lName = sc.nextLine();

    System.out.print("Enter your address: ");
    address = sc.nextLine();

    System.out.print("Enter your city: ");
    city = sc.nextLine();

    System.out.print("Enter your state: ");
    state = sc.nextLine();

    System.out.print("Enter your email: ");
    email = sc.nextLine();

    System.out.print("Enter your area zip code: ");
    zip = sc.nextInt();

    System.out.print("Enter your phone number: ");
    phNum = sc.nextLong();

  }

  Contact[] addContact(Contact[] contacts, Contact c) {
    for (int i = 0; i < contacts.length; i++) {
      if (contacts[i] == null) {
        contacts[i] = c;
        break;
      }
    }
    System.out.println("a new contact has been added");
    return contacts;
  }

}
