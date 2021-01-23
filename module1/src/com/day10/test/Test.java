package com.day10.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("马云", 20, 10000d);
        Student st2 = new Student("马云2", 50, 80000d);
        Student st3 = new Student("马云3", 40, 100d);
        Student st4 = new Student("马云4", 20, 1000d);
        Student st5 = new Student("马云5", 20, 100d);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);
        //比较器逻辑
//        Comparator<Emp> comparator=new Comparator<Emp>() {
//            @Override
//            public int compare(Emp o1, Emp o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        };
        //比较器---->
//        Collections.sort(arrayList, new Comparator<Emp>() {
//            @Override
//            public int compare(Emp o1, Emp o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        lambda表达式
//        Collections.sort(arrayList,(o1, o2) ->{
//                return o1.getAge()-o2.getAge();
//            }
//        );


        //年龄降序，年龄相同后，工资升序
//        lambda表达式
//        Collections.sort(arrayList, (o1, o2) -> {
//                    if (o1.getAge() == o2.getAge()) {
//                        if (o1.getMoney() > o2.getMoney()) {
//                            return 1;
//                        } else {
//                            return -1;
//                        }
//                    }
//                    return o1.getAge() - o2.getAge();
//                }
//        );
        Collections.sort(arrayList,(Student o1,Student o2)->{
            if (o1.getAge()==o2.getAge()){
                if (o1.getMoney()>o2.getMoney()){
                    return -1;
                }
                return 1;
            }
            return o1.getAge()-o2.getAge();
        });

        for (Student str : arrayList) {
            System.out.println(str);
        }
    }
}
