package com.day17.homework6;

public class Money implements Runnable {
    private Integer num = 0;
    private Integer sum=0;
    private Integer tum=0;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                String name=Thread.currentThread().getName();
                if (num >= 6 ) {
                        System.out.println(name+"一共存了三次,存钱总额度:" + num*100);
                    break;
                }
//                num = num + 1;
                if ("储户A".equals(name)){
                        sum++;
                        if (sum<=3){
                            num++;
                            System.out.println(name+"存了100块,额度为："+num*100);
                        }
                }

                if ("储户B".equals(name))  {
                    tum++;
                    if (tum<=3){
                        num++;
                        System.out.println(name+"存了100块,额度为："+num*100);
                    }
                }
            }
        }
    }
}
