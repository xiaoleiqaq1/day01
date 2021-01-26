package com.day17.homework6;

public class Demo {
    public static void main(String[] args) {
        Money money=new Money();
        Thread thread=new Thread(money,"储户A");
        thread.start();

        Thread thread1=new Thread(money,"储户B");
        thread1.start();
    }
}
