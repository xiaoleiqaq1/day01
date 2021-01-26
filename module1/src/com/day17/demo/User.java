package com.day17.demo;

public class User implements Runnable{
    Bank bank = new Bank();
    @Override
    public void run(){
        int num = 0;
        while(num <3){
            num++;
            synchronized(this){
                bank.deposits();
                System.out.println( Thread.currentThread().getName()
                        +      "正在"+(num)+"次存100元"+ bank.toString());
            }
        }
    }
}
