package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/20/2021 , 
    CREATED ON : 6:36 PM
*/

public class Main {
    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        System.out.println("***********************************************************");
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println("***********************************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
