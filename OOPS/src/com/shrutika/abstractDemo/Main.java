package com.shrutika.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(14);
        son.career();
        son.partner();
        System.out.println(son.age);
        son.normal();
        son.hello();
        System.out.println(son.VALUE);

        Daughter daughter = new Daughter(21);
        daughter.career();
        daughter.partner();
        System.out.println(daughter.age);
        daughter.normal();
        daughter.hello();
        System.out.println(daughter.VALUE);
//        Parent obj = new Parent();// ERROR because parent is an abstract class ,so it cannot be instantiated.


    }
}
