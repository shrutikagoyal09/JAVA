package com.shrutika.access_modifiers.package1;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Shrutika");
        System.out.println(obj.getNum());  //getNum method is used to access private
        // data members of a class in different class of same package and different
        // package.
        System.out.println(obj.name);
//        System.out.println(obj.num); //as num is private data member of class A,
//        it cannot be directly accessed.

        B obj1 = new B(14,"rohan");
        System.out.println(obj1.num);
        System.out.println(obj1.name);

    }
}
