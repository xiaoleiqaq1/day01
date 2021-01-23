package com.day04;

public class Dog {
    String name;
    int age;
    public Dog(){//构造方法
        this.name=name;
        this.age=age;
    }
    //代码块
    {
        System.out.println("这是构造代码块");
    }
    static {
        System.out.println("这是静态代码块");
    }
    //方法
    public void run(){

    }
    public void eat(){

    }
}
