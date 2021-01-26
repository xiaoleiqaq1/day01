package com.day17.homework4;

public class Door implements Runnable{
    private Integer people=80;
    private Integer sum=0;
    @Override
    public void run() {
        while (true){
            synchronized (this){//表示前中后门都不会抢占
                String name=Thread.currentThread().getName();
                if (people<=0){
                    //这样写是为了避免---空指针
                    if ("前门".equals(name)){
                        System.out.println("已经坐满了，不能再上车了");
                    }
                    break;
                }
                people--;

                if ("前门".equals(name)){
                    System.out.println(name+"上车，还剩"+people+"个座位");
                }else if ("中门".equals(name)){
                    System.out.println(name+"上车，还剩"+people+"个座位");
                }else {
                    System.out.println(name+"上车，还剩"+people+"个座位");
                }
//                sum++;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
