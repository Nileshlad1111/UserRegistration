package com.bridgelabz.utils;

import com.bridgelabz.model.User;

import java.util.Scanner;

public class Validator {

    //This method is used to validate the First Name
    public boolean checkFirstName(String firstName){
        return (firstName.matches("^[A-Z][a-zA-Z]{2,}$"));
    }

    //This method is used to validate the Last Name
    public boolean checkLastName(String lastName){
        return (lastName.matches("^[a-z ,.'-]+$"));
    }

    //  This method is used to validate email Id
    public boolean checkEmail(String email){
        return (email.matches("^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$"));
    }

    //This method is used to validate Mobile Number
    public boolean checkMobileNumber(String mobileNumber){
        return (mobileNumber.matches("^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$"));
    }

    //this method is used to validate password
    public boolean checkPassword(String password){
        return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,/~`_+=|].).{8,}$"));
    }

    //This method is used to print message after validation
    public void generateMessage() {
        User user = getValueByUser();
        if (checkFirstName(user.getFirstName()) == true) {
            System.out.println("provided First Name is valid");
        }
        else{
            System.out.println("provided First Name is Invalid");
        }
        if (checkLastName(user.getLastName()) == true){
            System.out.println("Provided Last Name is valid");
        }
        else {
            System.out.println("Provided Last Name is Invalid");
        }
        if (checkMobileNumber(user.getPhoneNumber()) == true) {
            System.out.println("Provided phone number is valid");
        }
        else
        {
            System.out.println("Provided phone number is Invalid");
        }
        if (checkEmail(user.getEmailId()) == true) {
            System.out.println("Provided Email is valid");
        }
        else {
            System.out.println("Provided Email is Invalid");
        }
        if (checkPassword(user.getPassword()) == true) {
            System.out.println("Provided Password is valid");
        }
        else {
            System.out.println("Provided Password is Invalid");
        }
    }

    //  This method is used to taking and setting all the values into POJO
    public User getValueByUser(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name");
        String firstName = scanner.next();
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        System.out.println("Enter mobile number");
        String phoneNumber = scanner.next();
        System.out.println("Enter email Id");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhoneNumber(phoneNumber);
        user.setEmailId(email);
        user.setPassword(password);

        return user;
    }

}
