package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/21/2021 , 
    CREATED ON : 12:02 AM
*/

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("2nd Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        //

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }

    private static int multiply(int number) {
        return number * multiplier;
    }
}
