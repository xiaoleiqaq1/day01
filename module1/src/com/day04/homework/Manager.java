package com.day04.homework;

public class Manager {
    private String name;
    private int number;
    private int money;
    private int jiangjin;

    public Manager() {
    }

    public Manager(String name, int number, int money, int jiangjin) {
        this.name = name;
        this.number = number;
        this.money = money;
        this.jiangjin = jiangjin;
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

    public int getJiangjin() {
        return jiangjin;
    }

    public void setJiangjin(int jiangjin) {
        this.jiangjin = jiangjin;
    }
    //intro方法
    public void intro(){
        System.out.println("经理姓名:"+name+"，工号信息："+number);
    }
    public void showSalary(){
        System.out.println("基本工资为:"+money+"奖金："+jiangjin);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码....");
    }
}
