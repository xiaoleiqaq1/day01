package com.day17.homework5;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws Exception{
        Work work1=new Work(10);
        FutureTask<Integer> futureTask1=new FutureTask(work1);
        Thread thread1=new Thread(futureTask1);
        thread1.start();
        System.out.println("10的阶乘："+futureTask1.get());
        //没有用
        thread1.setPriority(1);

        Work work2=new Work(8);
        FutureTask<Integer> futureTask2=new FutureTask(work2);
        Thread thread2=new Thread(futureTask2);
        thread2.start();
        System.out.println("8的阶乘："+futureTask2.get());
        thread2.setPriority(1);

        Work work3=new Work(5);
        FutureTask<Integer> futureTask3=new FutureTask(work3);
        Thread thread3=new Thread(futureTask3);
        thread3.start();
        System.out.println("5的阶乘："+futureTask3.get());
        thread3.setPriority(10);
    }
}
