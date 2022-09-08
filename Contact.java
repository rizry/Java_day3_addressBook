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

  Contact[] editContact(Contact[] contacts, short index) {

    Contact cc = new Contact();
    cc.getInputs();
    contacts[index] = cc;
    System.out.println("contact has been updated.");

    return contacts;
  }

  short getIndex(Contact[] contacts, String name) {
    short found = -1;
    for (short i = 0; i < contacts.length; i++) {
      if (contacts[i] != null && contacts[i].fName.equals(name)) {
        found = i;
        break;
      }
    }

    return found;
  }

  Contact[] deleteContact(Contact[] contacts, short index) {

    for (short i = index; i < contacts.length; i++) {
      contacts[i] = contacts[i + 1];
      if (contacts[i + 1] == null) break;
    }

    return contacts;

  }

  Contact[] showEditDelete(Contact[] contacts, String str) {
    if (contacts[0] == null) {
      System.out.print("You have no contacts yet. 'add' one before you " + str + ".\n");
      return contacts;

    } else {
      System.out.print("Your contacts are: ");
      for (Contact c : contacts) {
        if (c != null) System.out.print(c.fName + ", ");
        else break;
      }
      System.out.println();

      System.out.print("\nEnter a name to " + str + ". mind the case ");
      String name = sc.nextLine();

      short index = getIndex(contacts, name);

      if (index == -1) {
        System.out.println("we couldnt find " + name + ". try again. ");
      } else {
        switch (str) {
          case "edit":
            System.out.println("\n* " + name + " is being edited *");
            contacts = editContact(contacts, index);
            break;
          
          case "delete":
            contacts = deleteContact(contacts, index);
            System.out.println("contact " + name + " has been deleted.");
            break;
         
          case "show":
            showDetails(contacts, index);
            break;

          default:
            break;
        }
      }

      return contacts;
    }

  }

  void showDetails(Contact[] c, short i) {

    System.out.println("Contact Details ");
    System.out.print("Name: " + c[i].fName + " " + c[i].lName + "\nAddress: " + c[i].address + "\nCity: " + c[i].city + "\t\tState: "
      + c[i].state + "\t\tZip: " + c[i].zip + "\nEmail: " + c[i].email + "\t\tPhone number: " + c[i].phNum + "\n");
  }
}