package com.day17.day17;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo2 {
    public static void main(String[] args) throws Exception{
//        Thread thread=new Thread(){
//            @Override
//            public void run(){
//                System.out.println("nihao");
//            }
//        };
//        thread.start();
//
//        上面的thread不能使用兰姆达表达式：


//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Runnable的匿名内部类");
//            }
//        };
//        Thread thread=new Thread(runnable);
//        thread.start();
//
//        new Thread(()->{
//            System.out.println("兰姆达表达式");//应用于Runnable
//        }).start();


//        Callable callable=new Callable() {
//            @Override
//            public Object call() throws Exception {
//                return "callable的匿名内部类";
//            }
//        };
//        FutureTask<String> futureTask=new FutureTask(callable);
//        Thread thread1=new Thread(futureTask);
//        thread1.start();
//        System.out.println("返回值："+futureTask.get());


        FutureTask<Integer> futureTask=new FutureTask(()->{
            return 234;
        });
        Thread thread=new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());

        //不能使用futureTask.get()获得返回值
        new Thread(new FutureTask<String>(()->{
            System.out.println(Thread.currentThread().getName());
            return "Callable的兰姆达表达式";
        })).start();



        FutureTask<String> futureTask1=new FutureTask(()->{
            System.out.println("String类型的兰姆达表达式");
            return "返回值";
        });
        Thread thread1=new Thread(futureTask1);
        thread1.start();
        System.out.println(futureTask1.get());
    }
}
