package com.day17.homework2;

public class Dong1 implements Runnable{

    @Override
    public void run() {
            synchronized (this){
                String name=Thread.currentThread().getName();
                System.out.println(name+"开始进山洞了");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("进去山洞了");
            }
    }
}
