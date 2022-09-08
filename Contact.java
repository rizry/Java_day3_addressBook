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

  Contact[] editContact(Contact[] contacts) {

    if (contacts[0] == null) {
      System.out.print("You have no contacts yet. 'add' one before you edit.\n");
      return contacts;

    } else {
      System.out.print("Your contacts are: ");
      for (Contact c : contacts) {
        if (c != null) System.out.print(c.fName + ", ");
        else break;
      }
      System.out.println();

      System.out.print("\nEnter a name to edit. mind the case ");
      String name = sc.nextLine();

      short index = checkContact(contacts, name);

      if (index == -1) System.out.println("we couldnt find " + name + ". try again. ");
      else {
        System.out.println("\n* " + name + " is being edited *");

        Contact cc = new Contact();
        cc.getInputs();
        contacts[index] = cc;

        System.out.println("contact has been updated.");
      }

      return contacts;
    }
  }

  short checkContact(Contact[] contacts, String name) {
    short found = -1;
    for (short i = 0; i < contacts.length; i++) {
      if (contacts[i] != null && contacts[i].fName.equals(name)) {
        found = i;
        break;
      }
    }

    return found;
  }
}
