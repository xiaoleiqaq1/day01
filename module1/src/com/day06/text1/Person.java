package com.day06.text1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void eat(){
        System.out.println(this.name+"在吃饭!"+"今年："+this.age);
    }
    public void sleep(){
        System.out.println(this.name+"在睡觉！"+"今年："+this.age);
    }
}
