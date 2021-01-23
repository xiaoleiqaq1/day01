package com.day04;

public class Student {
    private String name;
    private int age;

    public void run(){
        System.out.println("我在跑步！！！");
    }

    //无参构造方法
    public Student() {
    }

    //有参数构造方法,
    //注意事项：使用有参构造方法后，不带参的空构造方法就不会再自动产生并存在。
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
