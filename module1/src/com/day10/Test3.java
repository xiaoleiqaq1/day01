package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//       LinkedList<LinkedList<Emp>> linkedList=new LinkedList();
        //无序，不可重复
        HashSet<String>  set = new HashSet<String>();

        //添加元素
        set.add(new String("cba"));
        set.add("abc");
        set.add("bac");
        set.add("cba");
        //遍历//加强版的就行   fori这种类型不行
//        for (String name : set) {
//            System.out.println(name);
//        }
        HashSet<Student> hashSet=new HashSet<>();
//        Emp stu = new Emp("于谦", 43);
//        linkedList.add(stu);
        hashSet.add(new Student("马云",45));
        hashSet.add(new Student("马化腾",55));
        hashSet.add(new Student("马斯诺",35));
        hashSet.add(new Student("马斯诺",35));
        hashSet.add(new Student("马斯诺",35));
        hashSet.add(new Student("马斯诺4",35));
        for (Student str:hashSet){
            System.out.println(str);
        }
        System.out.println("----------------");
        //迭代器：
        Iterator<Student> it=hashSet.iterator();
        //it.hasNext()返回的只有true,false,当有元素时，返回true,没有元素就返回false.
        while (it.hasNext()){
            //每次遍历完，指针指向下一个元素
            Student it1=it.next();//只能写一次，不能写多个，it.next();
            System.out.println(it1);
        }
        //集合的嵌套，双重集合。
        HashSet<Student> hashSet1=new HashSet<>();
        HashSet<HashSet<Student>> hashSets=new HashSet<>();
        hashSets.add(hashSet1);
        hashSets.add(hashSet1);

    }
}
