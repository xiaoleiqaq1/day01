package com.day17.homework3;

public class Demo {
//    public static Integer num=100;
    public static void main(String[] args) {
        Cup cup=new Cup();
        Thread thread=new Thread(cup,"官网");
        Thread thread1=new Thread(cup,"实体店");
        thread.start();
        thread1.start();












//        Demo demo= new Demo();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    synchronized (demo){
//                        if (num<=0){
//                            System.out.println("水杯卖光了！");
//                            break;
//                        }
//                        System.out.println("实体店卖了第"+num+"个");
//                        num--;
//                    }
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    synchronized (demo){
//                        if (num<=0){
//                            System.out.println("水杯卖光了！");
//                            break;
//                        }
//                        System.out.println("官网卖了第"+num+"个");
//                        num--;
//                    }
//
//                }
//            }
//        }).start();
    }
}
