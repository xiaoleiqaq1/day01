package com.day06.text2;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("旺财","黑色",180);
        dog.eat();
        dog.lookHome();
        System.out.println("------------");

        Cat cat =new Cat("橘猫","黄色",50);
        cat.eat();
        cat.catchMouse();
    }
}
