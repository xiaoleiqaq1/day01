package com.day06.test4;

public class Test {
    public static void main(String[] args) {
        Rooster rooster=new Rooster("公鸡",2,"红色");
        rooster.eat();
        rooster.sing();

        Duck duck=new Duck("鸭子",1,"黑色");
        duck.eat();
        duck.swim();
    }
}
