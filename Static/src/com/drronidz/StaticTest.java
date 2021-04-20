package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/21/2021 , 
    CREATED ON : 12:02 AM
*/

public class StaticTest {
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;

    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
