package com.day05;

public class Student extends Person{
    String number;

    public Student() {
    }

    public Student(String number) {
        this.number = number;
    }

    public Student(String name, int age, String number) {
        super(name, age);
        this.number = number;
    }

    public void learn(){
        System.out.println("我在学习!!!");
    }
    //方法的重写
    @Override
    public void run(){
        super.run();
        System.out.println("我是学生，我在跑步");
    }
}
