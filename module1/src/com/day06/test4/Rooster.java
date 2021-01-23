package com.day06.test4;

public class Rooster extends Animal{
    public Rooster() {
    }

    public Rooster(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getColor()+
                "的"+super.getName()+"在啄米");
    }
    public void sing(){
        System.out.println(super.getAge()+"岁的"+super.getColor()+
                "的"+super.getName()+"在打鸣");
    }
}
