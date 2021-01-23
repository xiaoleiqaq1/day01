package com.day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add("i");
        }
        long end=System.currentTimeMillis();
        System.out.println("ArrayList的时间："+(end-start));

        LinkedList<String> linkedList=new LinkedList();
        long start1=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add("i");
        }
        long end1=System.currentTimeMillis();
        System.out.println("linkedList的时间："+(end1-start1));
    }
}
