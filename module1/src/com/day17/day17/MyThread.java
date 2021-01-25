package com.day17.day17;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("线程名:" + Thread.currentThread().getName());
        long id = Thread.currentThread().getId();
        System.out.println("当前线程ID：" + id);
    }
}
