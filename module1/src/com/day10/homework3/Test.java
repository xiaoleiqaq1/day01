package com.day10.homework3;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList array1=new ArrayList();
        ArrayList array2=new ArrayList();
        array1.add("a");
        array1.add("b");
        array1.add("a");
        array1.add("c");
        array1.add("d");

        array2.add("e");
        array2.add("f");
        array2.add("a");
        array2.add("d");
        array2.add("g");
        HashSet hashSet=new HashSet();
        for (int i = 0; i < array1.size(); i++) {
            hashSet.add(array1.get(i));
        }
        for (int i = 0; i < array2.size(); i++) {
            hashSet.add(array2.get(i));
        }
        System.out.println(hashSet);
    }
}
