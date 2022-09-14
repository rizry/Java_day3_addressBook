package com.java.day10.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  static final Scanner SC = new Scanner(System.in);

  static HashMap<String, AddressBook> addressBookList = new HashMap<>();

  public static void main(String[] args) {
    System.out.println("--Welcome to Address Book Program--");

    String choice = "add";

    while (!choice.equals("quit")) {
      System.out.print("\nMain Menu \n1. create \n2. edit \n3. delete \n4. view \n5. quit \nEnter your choice: ");
      choice = SC.nextLine().trim().toLowerCase();

      switch (choice) {
      case "add":
      case "1":
        AddressBook a = new AddressBook();
        System.out.print("Enter a name for your addressbook ");
        String name = SC.nextLine();
        a.name = name;
        a.menu(a);
        addressBookList.put(name, a);
        break;

      case "edit":
      case "2":
        a = new AddressBook();
        addressBookList = a.viewEditDelete(addressBookList, "edit");
        break;

      case "delete":
      case "3":
        a = new AddressBook();
        addressBookList = a.viewEditDelete(addressBookList, "delete");
        break;

      case "view":
      case "4":
        a = new AddressBook();
        addressBookList = a.viewEditDelete(addressBookList, "view");
        break;

      case "quit":
      case "5":
        choice = "quit";
        break;

      default:
        System.out.println("that didnt match any choice, try again");
        break;
      }
    }

  }
}