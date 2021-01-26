package com.day17.day17;

public class Ticket implements Runnable {
    private Integer num = 300;

//    Object object=new Object();
    @Override
    public void run() {
        while (true) {
            //this代表当前Ticket对象，只要保证对象唯一，线程就安全
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("票卖完了");
                    break;
                }
                System.out.println("窗口:" + Thread.currentThread().getName() + ",正在卖:" + num);
                num--;
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
}
