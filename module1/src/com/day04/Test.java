package com.day04;

public class Test {
    public static void main(String[] args) {
//
//        Person person=new Person();
//        person.setName("xiaolei2");
//        System.out.println(person.getName());
//        person.setAge(19);
//        System.out.println(person.getAge());
        //Emp()调用的是无参构造方法
        ////get /set
        Student student=new Student();
        student.setName("xiaolei");
        student.setAge(18);
        System.out.println(student.getName());
        System.out.println(student.getAge());

        //有参构造方法调用
        Student student1=new Student("xiaolei1",19);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());


        //调用方法
        Student student2=new Student();
        student2.run();


        //Sutdent1的调用,
        //这个证明了构造方法和位置没有关系。
        Student1 student11=new Student1();
        student11.setName("xiao");
        student11.setAge(22);
        System.out.println(student11.getName());
        System.out.println(student11.getAge());
        student11.run();
    }
}
