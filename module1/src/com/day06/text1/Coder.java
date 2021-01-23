package com.day06.text1;

public class Coder extends Person{
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
    public void coding(){
        System.out.println(super.getName()+"在敲代码！");
    }
}
