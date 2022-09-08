package com.java.day9;

public class AddressBookMain {

  public static void main(String[] args) {
  System.out.println("--Welcome to Address Book Program--");

  Contact c = new Contact();
  c.getInputs();

  System.out.println("\nHere's what was entered: " + c.fName + " " + c.lName + " " + c.address + " " + c.city + " "
    + c.state + " " + c.email + " " + c.zip + " " + c.phNum);

  }
}