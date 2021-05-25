package com.bridgelabz;

public class User {
    //This method is used to validate the First Name
    public boolean checkFirstName(String firstName) {
        return (firstName.matches("[A-Z][a-z]{3,}"));
    }
}
