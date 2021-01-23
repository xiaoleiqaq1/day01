package com.day10.test;

/**
 * @auth admin
 * @date 2021/1/14
 * @Description
 */
//public class Emp implements Comparable<Emp> {
public class Student  {

    private String name;
    private Integer age;
    private Double money;

//    @Override
//    public int compareTo(Emp o) {
////        return this.age-o.getAge();
//        if (o.getAge() == this.age) {
////            //说明年龄相同，在对工资排序
////            if (o.getMoney() > this.money) {
////                return -1;
////            } else if (o.getMoney() < this.money) {
////                return 1;
////            } else {
////                return 0;
//            }
//        }
//        return this.age - o.getAge();
//
//    }

    public Student() {
    }

    public Student(String name, Integer age, Double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
