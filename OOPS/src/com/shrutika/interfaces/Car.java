package com.shrutika.interfaces;

public class Car implements Brake, Engine{
      int a;
    @Override
    public void brake() {
        System.out.println("I am brake");
    }

    @Override
    public void start() {
        System.out.println("I am start");
    }

    @Override
    public void stop() {
        System.out.println("I am stop");
    }

    @Override
    public void accelerate() {
        System.out.println("I am acceleration");
    }
}
