package com.day06.text2;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color, int price) {
        super(name, color, price);
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void catchMouse(){
        System.out.println(super.getName()+"在抓老鼠");
    }
}
