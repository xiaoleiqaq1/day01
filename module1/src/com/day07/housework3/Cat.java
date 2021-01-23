package com.day07.housework3;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+"吃鱼");
    }

    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }
}
