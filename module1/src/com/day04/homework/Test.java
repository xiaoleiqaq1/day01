package com.day04.homework;

public class Test {
    public static void main(String[] args) {
        //第一题
        //无参构造方法
        Circle circle=new Circle();
        circle.setR(3);
        circle.showArea();
        circle.showPerimeter();
        System.out.println("--------------");

        //有参构造方法
        Circle circle1=new Circle(3);
        circle1.showArea();
        circle1.showPerimeter();


        //第二题：
        System.out.println("第二题");
        Manager manager=new Manager("James",9527,15000,3000);
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("--------------");
        Coder coder=new Coder("Kobe",01,1000);
        coder.intro();
        coder.showSalary();
        coder.work();

    }
}

