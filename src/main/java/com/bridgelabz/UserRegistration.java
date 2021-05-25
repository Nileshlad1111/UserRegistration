package com.bridgelabz;

public class UserRegistration {

    public static void main(String[] args) {
        //object
        User user = new User();
        //method call
        System.out.println(user.checkFirstName("Nilesh"));
        System.out.println(user.checkLastName("Lad"));
        System.out.println(user.checkEmail("ladnilesh1994@gmail.com"));
        System.out.println(user.checkMobileNumber("91 8888310299"));
        System.out.println(user.checkPassword("aesrF88310299"));
    }
}

