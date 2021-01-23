package com.day06.testAbstract;

public abstract class Gress extends Animal{
    public Gress() {
    }

    public Gress(String name, int age) {
        super(name, age);
    }

    public abstract void run();
}
