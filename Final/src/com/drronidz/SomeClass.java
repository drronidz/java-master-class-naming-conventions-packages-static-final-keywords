package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/21/2021 , 
    CREATED ON : 12:22 AM
*/

public class SomeClass{
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
