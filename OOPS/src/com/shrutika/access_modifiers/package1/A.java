package com.shrutika.access_modifiers.package1;

public class A {
    private int num;
      String name;
    int[] arr = new int[num];

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
     this.name = name;
     this.num=num;
    }
}

