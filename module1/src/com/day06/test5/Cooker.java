package com.day06.test5;

public class Cooker extends Person{
    public Cooker() {
    }

    public Cooker(int number, String name, int money) {
        super(number, name, money);
    }

    @Override
    public void work() {
        System.out.println("工号为:"+super.getNumber()+",姓名为:"+getName()+
                ",工资为:"+getMoney()+"的厨师在工作，炒菜");
    }

    @Override
    public void eat() {
        System.out.println("工号为:"+super.getNumber()+",姓名为:"+getName()+
                ",工资为:"+getMoney()+"的经理在吃肉");
    }
}
