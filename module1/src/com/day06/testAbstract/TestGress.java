package com.day06.testAbstract;

public class TestGress extends Gress{
    public TestGress() {
    }

    public TestGress(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(super.name+"正在吃草");
    }

    @Override
    public void run() {
        System.out.println(super.name+"正在跑步");
    }
}
