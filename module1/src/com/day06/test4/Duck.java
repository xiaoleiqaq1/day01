package com.day06.test4;

public class Duck extends Animal{
    public Duck() {
    }

    public Duck(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getColor()+
                "的"+super.getName()+"在吃饭");
    }
    public void swim(){
        System.out.println(super.getAge()+"岁的"+super.getColor()+
                "的"+super.getName()+"在游泳");
    }
}
