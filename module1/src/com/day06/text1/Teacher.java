package com.day06.text1;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
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
    public void teach(){
        System.out.println(super.getName()+"正在教书！");
    }
}
