package com.day17.homework3;

public class Cup implements Runnable{
    private Integer num=100;
    private Integer sum=0;
    private Integer tum=0;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                String name=Thread.currentThread().getName();
                if (num<=0){
                    if("官网".equals(name)){
                        System.out.println("--------------------");
                        System.out.println("杯子已经卖光了");
                        System.out.println("官网卖出的杯子"+sum+"个");
                        System.out.println("实体店卖出的杯子"+tum+"个");
                    }
                    break;
                }
                num--;

                if("官网".equals(name)){
                    sum++;
                    System.out.println(name+"卖出"+(100-num)+"个杯子，剩余"+num+"个杯子");
                }else{
                    tum++;
                    System.out.println(name+"卖出"+(100-num)+"个杯子，剩余"+num+"个杯子");
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
