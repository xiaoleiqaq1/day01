package com.day04.homework;

public class Coder {
    private String name;
    private int number;
    private int money;
    //无参构造方法
    public Coder() {
    }
    //有参构造方法
    public Coder(String name, int number, int money) {
        this.name = name;
        this.number = number;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //intro方法
    public void intro(){
        System.out.println("程序员姓名:"+name+"，工号信息："+number);
    }
    public void showSalary(){
        System.out.println("基本工资为:"+money);
    }
    public void work(){
        System.out.println("我正在敲代码");
    }
}
