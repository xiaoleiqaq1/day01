package com.day17.day17;


/*

* 线程优先级setPriority()
* 守护线程setDaemon()
*
* */

public class Demo3 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("niaho");
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程1："+i);
                }
            }
        });


        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i==10){
                        try {
                            //让线程1去插队----
                            thread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程2："+i);
                }
            }
        });


        thread.start();
        thread1.start();
    }
}
