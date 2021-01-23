package com.day06.text1;

public class Test {
    public static void main(String[] args) {

        Coder coder=new Coder("程序员",18);
        coder.eat();
        coder.sleep();
        coder.coding();
        System.out.println("----------");

        Teacher teacher=new Teacher("老师",30);
        teacher.eat();
        teacher.sleep();
        teacher.teach();
    }
}
