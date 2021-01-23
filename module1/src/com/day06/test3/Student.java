package com.day06.test3;

public class Student extends Person{
    private double score;

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
    public void test(){
        System.out.println(super.getName()+"同学，考试得了："+this.score+"分");
    }

}
