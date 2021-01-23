package com.day06.test6;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(int number, String name) {
        super(number, name);
    }

    @Override
    public void work() {
        System.out.println("工号为："+super.getNumber()+"的讲师 "+super.getName()+" 正在解决学生的问题");
    }
}
