package com.day07.housework4;

public class Student extends Person{
    public Student() {
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("年龄"+getAge()+" 岁的"+getName()+" 在吃学生餐");
    }
}
