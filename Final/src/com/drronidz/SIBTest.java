package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/22/2021 , 
    CREATED ON : 6:18 PM
*/

public class SIBTest {

    public static final String owner ;

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static  {
        owner = "TIM";
        System.out.println("1st static initialization block called");
    }



    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
