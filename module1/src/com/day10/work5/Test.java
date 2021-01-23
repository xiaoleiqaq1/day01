package com.day10.work5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, ArrayList<ArrayList<Student>> > map = new HashMap();
//        map.put("中山大学",new ArrayList<ArrayList<Emp>>());
//        map.put("广州大学",new ArrayList<ArrayList<Emp>>());
        ArrayList<ArrayList<Student>> school1 =new ArrayList<>();
        ArrayList<ArrayList<Student>> school2 =new ArrayList<>();

        ArrayList<Student> class1=new ArrayList<>();
        ArrayList<Student> class2=new ArrayList<>();

        class1.add(new Student("小雷",23));
        class1.add(new Student("小天",22));
        class1.add(new Student("小白",24));

        class2.add(new Student("小东",18));
        class2.add(new Student("小虎",20));
        class2.add(new Student("小言",18));

        school1.add(class1);
        school1.add(class2);

        school2.add(class1);
        school2.add(class2);

        map.put("中山大学",new ArrayList<ArrayList<Student>>());
        map.put("广州大学",new ArrayList<ArrayList<Student>>());
        Set<String> strings =map.keySet();
        for (String key:strings){
            ArrayList<ArrayList<Student>> school=map.get(key);
            System.out.println(school);
        }
    }
}
