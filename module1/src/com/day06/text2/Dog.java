package com.day06.text2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color, int price) {
        super(name, color, price);
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void lookHome(){
        System.out.println(super.getName()+"正在看家");
    }
}
