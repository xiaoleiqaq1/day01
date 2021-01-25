package com.day17.day17;

import java.util.concurrent.FutureTask;

public class Demo1 {
    public static void main(String[] args) throws Exception{

        MyThread1 myThread1=new MyThread1();
//实现Callable接口通过FutureTask包装器来实现的线程
        FutureTask futureTask = new FutureTask(myThread1);
        Thread thread = new Thread(futureTask,"线程的名字");
        thread.start();

        System.out.println("返回值：" + futureTask.get());//这段代码只能放后面。。。
    }   public void a(){
        MyThread1 myThread1=new MyThread1();

//        Thread thread=new Thread(myThread1);
//        Thread thread=new Thread(myThread1,"Runable的线程");
//        thread.start();
    }
}
