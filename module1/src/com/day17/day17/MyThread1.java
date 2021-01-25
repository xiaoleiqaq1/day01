package com.day17.day17;

import java.util.Calendar;
import java.util.concurrent.Callable;

public class MyThread1 implements Callable<String> {
//public class MyThread1 implements Runnable{

//    @Override
//    public void run() {
//        System.out.println("hello");
//        System.out.println("1");
//        System.out.println("name:"+Thread.currentThread().getName());
//        System.out.println("id:"+Thread.currentThread().getId());
//    }

    //带返回值的内容

    @Override
    public String call() throws Exception {
        System.out.println("线程名:" + Thread.currentThread().getName());
//        程序睡眠5秒再执行
        Thread.sleep(5000);
        return "hello";
    }
}
