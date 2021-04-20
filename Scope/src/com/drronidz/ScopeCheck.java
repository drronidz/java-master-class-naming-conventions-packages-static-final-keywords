package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/20/2021 , 
    CREATED ON : 6:37 PM
*/

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created \n"
                + "publicVar = " + publicVar + "\n"
                + "privateVar = "+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        //int privateVar = 2;
        for(int i =0; i<10; i++){
            System.out.println( i + " times two is " + i * privateVar);
        }
    }

    public class InnerClass{
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo(){
            int privateVar = 2;
            for (int i = 0; i <10 ; i++) {
                System.out.println( i + " times two is " + i * ScopeCheck.this.privateVar);
            }
        }
    }
}