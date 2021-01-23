package com.day05;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("张三",18);
        System.out.println(person.getName());
        person.run();
        //
        Student student=new Student("李四",19,"0101");
//        student.setName("王五");
//        student.run();//调用父类的方法
        student.setName("xiaolei");//重新设置父类的名字
        System.out.println(student.getName());//调用getName
        student.run();
    }
}
