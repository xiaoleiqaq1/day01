package com.day17.day17;

public class Demo {
    public static void main(String[] args) {
        System.out.println("hello");
        MyThread myThread=new MyThread("新的线程名字");
        myThread.start();

        System.out.println("world");
    }
}
