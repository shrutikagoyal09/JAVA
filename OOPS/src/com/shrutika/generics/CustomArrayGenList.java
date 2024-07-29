package com.shrutika.generics;

import java.util.Arrays;

public class CustomArrayGenList<T extends Number> {
    @Override
    public String toString() {
        return "CustomArrayGenList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private Object[] data;
    private static int DEFAULT_SIZE =10;
    int size=0;//working as index value

    public CustomArrayGenList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        Object[] temp = new Object[DEFAULT_SIZE*2];
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index] = value;
    }


    public static void main(String[] args) {
        CustomArrayGenList<Integer> list = new CustomArrayGenList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
//        list.remove();
//        System.out.println(list);
//        list.set(2,99);
//        System.out.println(list);
//        System.out.println(list.get(2));
    }

}
