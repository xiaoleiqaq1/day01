package com.day10.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//
public class Test1 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<Student,String>();
        Student student1=new Student("lisi1",8,100d);
        Student student2=new Student("lisi2",128,10d);
        Student student3=new Student("lisi3",38,100d);
        Student student4=new Student("lisi4",28,100d);
        map.put(student1,"上海");
        map.put(student2,"北京");
        map.put(student3,"武汉");
        map.put(student4,"广州");
//        System.out.println(map);//输出的是地址
//        遍历输出
        Set<Student> map1=map.keySet();
        for (Student str:map1){
//            System.out.println(str);//student的地址
            String value=map.get(str);
            System.out.println("键："+str+"值："+value);
        }


    }
}
