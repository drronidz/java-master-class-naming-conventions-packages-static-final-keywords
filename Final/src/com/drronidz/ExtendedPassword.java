package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/22/2021 , 
    CREATED ON : 6:14 PM
*/

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

  /*  @Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }*/
}
