package com.shrutika.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private int[] data;
    private static int DEFAULT_SIZE =10;
    int size=0;//working as index value

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        int[] temp = new int[DEFAULT_SIZE*2];
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index] = value;
    }


    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        //when arraylist gets full and a new element has to
        // be inserted then internally a new arraylist of
        // double size is created and the elements of original
        // list is copied to new list and element is added in
        // the new list.

//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.isEmpty();
//        list.set(1,765);
//        list.size();


        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(9);
        list.add(6);
        System.out.println(list);
        list.remove();
        System.out.println(list);
         list.set(2,99);
        System.out.println(list);
        System.out.println(list.get(2));
    }

}
