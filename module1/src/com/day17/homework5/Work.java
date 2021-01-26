package com.day17.homework5;


import java.util.concurrent.Callable;

public class Work implements Callable {
    private Integer num;
    private Integer result=1;

    public Work() {
    }

    public Work(Integer num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
//        synchronized (this){
            for (int i = 1; i <= num; i++) {
                result=result*i;
            }
            return result;
//        }
    }
}
