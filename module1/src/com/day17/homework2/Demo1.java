package com.day17.homework2;

public class Demo1 {
    public static void main(String[] args) {
        Dong1 dong1=new Dong1();
        for (int i = 1; i <= 10 ; i++) {
            Thread thread=new Thread(dong1,i+"");
            thread.start();
        }
    }
}
