package com.day17.homework2;

public class Dong implements Runnable{
    private Integer num=0;
    @Override
    public void run() {
//        while(true){
            synchronized (this){
//                if (num<=0){
//                    break;
//                }
//                num++;
                System.out.println(Thread.currentThread().getName()+"经过了山洞");
//                num--;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
