package com.day06.testAbstract;

public class TestMeat extends Gress{
    public TestMeat() {
    }

    public TestMeat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(super.name+"正在吃肉");
    }

    @Override
    public void run() {
        System.out.println(super.name+"正在追羊");
    }
}
