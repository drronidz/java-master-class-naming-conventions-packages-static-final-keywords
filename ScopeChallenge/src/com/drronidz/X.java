package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/20/2021 , 
    CREATED ON : 11:36 PM
*/

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner scanner) {
        System.out.println("Please enter a number");
        this.x = scanner.nextInt();
    }

    public void x(){
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x +" equals " + x * this.x);
        }
    }
}
