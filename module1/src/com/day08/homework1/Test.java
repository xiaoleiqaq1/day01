package com.day08.homework1;

public class Test {
    public static void main(String[] args) {
//
//        题目：请使用代码实现
//
//        1. 每一个学生(Emp)都有学号,姓名和分数,分数永远不能为为负数。
//        2. 如果试图给学生赋值一个负数,抛出一个自定异常

        Student student=new Student();
        try {
            student.setScore(10);
            System.out.println("分数没有问题:"+student.getScore()+"分");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
