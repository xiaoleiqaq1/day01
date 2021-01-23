package com.day07.test;

public class Test {
    public static void main(String[] args) {
        //成员内部类的调用(第一种方式）
        Person person=new Person();
        Person.Student student=person.new Student();
        student.run();

        //成员内部类的调用(第二种方式）
        Person.Student student1=new Person().new Student();
        student1.run();

        //局部内部类的调用
        Person person1=new Person();
        person1.student();
    }
}
