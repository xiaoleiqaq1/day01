package com.day10.homework1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ///数组的时候用arr.length;
        //集合的时候用arrayList.size();
        String arr[] = {"abc", "bad", "abc", "aab", "bad", "cef", "jhi"};
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
//
//        数组里面的元素添加进 ArrayList，但元素不能重复.
        ArrayList<String> arrayList1= new ArrayList();
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (arrayList1.contains(str)) {
                continue;
            } else {
                arrayList1.add(str);
            }
        }
        System.out.println(arrayList1);

    }
}
