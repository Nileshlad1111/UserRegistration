package com.bridgelabz;

public class User {
    //This method is used to validate the First Name
    public boolean checkFirstName(String firstName) {
        return (firstName.matches("^[A-Z][a-z]{3,}$"));
    }

    //This method is used to validate the Last Name
    public boolean checkLastName(String lastName) {
        return (lastName.matches("^[A-Z][a-z]{2,}$"));
    }
}
