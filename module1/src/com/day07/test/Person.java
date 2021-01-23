package com.day07.test;

public class Person {
    private String name;

    public void student() {
        //局部内部类--->定义在方法内部
        class Student {
            public void run() {
                System.out.println("我也在跑步");
            }

        }
        //内部类的调用
        Student student = new Student();
        student.run();
    }

    //成员内部类
    public class Student {
        public void run() {
            System.out.println("我在跑步");
        }

    }
}
