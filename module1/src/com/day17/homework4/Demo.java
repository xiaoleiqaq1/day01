package com.day17.homework4;

public class Demo {
    public static void main(String[] args) {
        Door door=new Door();
        Thread thread1=new Thread(door,"前门");
        thread1.start();

        Thread thread2=new Thread(door,"中门");
        thread2.start();

        Thread thread3=new Thread(door,"后门");
        thread3.start();
    }
}
