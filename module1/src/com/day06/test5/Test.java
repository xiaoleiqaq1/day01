package com.day06.test5;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager(110,"老王",10000);
        manager.eat();
        manager.work();
        Cooker cooker=new Cooker(120,"小王",6000);
        cooker.eat();
        cooker.work();
    }
}
