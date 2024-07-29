package com.shrutika.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age){
        this.age=age;
        VALUE = 12345;
    }

    void normal(){
        System.out.println("I am normal");
    }
    static void hello(){
        System.out.println("hello guys");
    }
    abstract void career();
    abstract void partner();
}
