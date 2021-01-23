package com.day06.testAbstract;

public abstract class Meat extends Animal{
    public Meat() {
    }

    public Meat(String name, int age) {
        super(name, age);
    }

    public abstract void run();
}
