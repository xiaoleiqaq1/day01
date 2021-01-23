package com.day07.housework3;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+"吃骨头");
    }

    public void lookHome(){
        System.out.println("老老实实看家");
    }
}
