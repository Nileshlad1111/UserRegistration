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

    //  This method is used to validate email Id
    public boolean checkEmail(String email){
        return (email.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    //This method is used to validate Mobile Number
    public boolean checkMobileNumber(String mobileNumber){
        return (mobileNumber.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
    }
}
