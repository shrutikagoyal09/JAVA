package com.shrutika.interfaces;

public class CDPlayer implements Media{
    @Override
    public void starts() {
        System.out.println("Music Starts");
    }

    @Override
    public void stops() {
        System.out.println("Music stops");
    }
}
