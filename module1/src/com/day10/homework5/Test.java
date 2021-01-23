package com.day10.homework5;

import com.day10.test.Student;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> people=new ArrayList<>();
        people.add(new Person("马云",50,4100d));
        people.add(new Person("马云",50,100d));
        people.add(new Person("马云3",50,4100d));
        people.add(new Person("马云3",50,4000d));
        people.add(new Person("马云5",50,400d));
        people.add(new Person("马化腾",20,4000d));
        people.add(new Person("马化腾2",50,400d));
        people.add(new Person("马化腾3",90,9000d));
        people.add(new Person("马化腾4",30,3000d));
        people.add(new Person("马化腾5",20,4010d));
        //如何遍历输出单个值
        //如何遍历输出
        //如何遍历输出
        //如何遍历输出   people.get(0).getMoney;


//        1.对年龄降序排序，如果年龄相同，则对工资升序排序
        Collections.sort(people,(a,b)->{
            if (a.getAge()==b.getAge()){
                if (a.getMoney()>b.getMoney()){
                    return 1;
                }else {
                    return -1;
                }
            }
            return b.getAge()-a.getAge();
        });

//        .打印最高工资，最低工资，平均工资，高于平均工资的人数。
        Collections.sort(people,(a,b)->{
            if (a.getMoney()>b.getMoney()){
                return 1;
            }else {
                return -1;
            }
        });
        for (Person str:people){
            System.out.println(str);
        }
        //重点：：：：：people.get(0)获取第一个对象，对象中的.getMoney()获取对于的值
        System.out.println("最低工资："+people.get(0).getMoney());
        System.out.println("最高工资："+people.get(people.size()-1).getMoney());
        double sum=0;
        for (int i = 0; i < people.size(); i++) {
             sum+=people.get(i).getMoney();
        }
        double sum1=sum/people.size();

        System.out.println("平均工资为："+sum1);
        int count=0;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getMoney()>sum1) {
                count++;
            }
        }
        System.out.println("超过平均工资的人数："+count);

        System.out.println("--------------");


        //重写toString()方法
//        for (Person str:people){
//            System.out.println(str);
//        }

//        2.新建HashSet集合去掉重复，（仅姓名和年龄相同的人视为重复，不考虑工资）。
        Set<Person> people1=new HashSet<>(people);
        //重写equals方法
        for (Person str:people1){
            System.out.println(str);
        }
    }
}
