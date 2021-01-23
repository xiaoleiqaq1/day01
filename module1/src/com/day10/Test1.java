package com.day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("小雷");
        arrayList.add("特朗普");
        arrayList.add("奥巴马");
//        arrayList.remove("奥巴马");//删除，
//        arrayList.remove(2);//删除，
        arrayList.add(2,"普京");//指定位置添加
        arrayList.set(3,"普京2");//指定位置添加,不能超过集合长度
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
        //使用增加for
//        for (String str:arrayList){
//            System.out.println(str);
//        }


        LinkedList<String> linkedList=new LinkedList();
        linkedList.add("张三");
        linkedList.add("李四");
        linkedList.add("王五");
        linkedList.add("小二");
        for (String str:linkedList){
            System.out.println(str);
        }

//        - public void addFirst(E e):将指定元素插入此列表的开头。
//        - public void addLast(E e):将指定元素添加到此列表的结尾。
//        public E pop():从此列表所表示的堆栈处弹出一个元素。
        String link=linkedList.pop();
        System.out.println("pop"+link);
    }
}
