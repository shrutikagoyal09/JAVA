package com.shrutika.generics.comparingobjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student shruti = new Student(18,96.99f);
        Student sallu = new Student(19,98.99f);
        Student rahul = new Student(17,92.89f);
        Student sima = new Student(16,91.94f);
        Student siya = new Student(15,88.97f);


        Student[] list = {shruti,sallu,rahul,sima,siya};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));




        if(shruti.compareTo(sallu) <0){
            System.out.println(shruti.compareTo(sallu));
            System.out.println("sallu has more marks");
        }
    }
}
