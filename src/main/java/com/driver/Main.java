package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj1 = new RWOnly();
        obj1.setName("Niket");
        obj1.setAge(23);

        System.out.println(obj1.getName()+"\n"+obj1.getAge()+"\n");
    }
}