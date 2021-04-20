package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/20/2021 , 
    CREATED ON : 6:36 PM
*/

public class Main {
    public static void main(String[] args) {
        String varFour = "this is private to main()";

        System.out.println("***********************************************************");
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        System.out.println("***********************************************************");
        scopeInstance.useInner();

        scopeInstance.timesTwo();
        System.out.println("***********************************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
