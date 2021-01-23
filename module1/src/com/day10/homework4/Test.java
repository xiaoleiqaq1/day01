package com.day10.homework4;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
//        双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
//        红色球号码从1—334中选择；蓝色球号码从1—16中选择.
//        请随机生成一注双色球号码，例如 红1蓝2
        ArrayList<String> arrayList1=new ArrayList();
        for (int i = 1; i <= 33; i++) {
            arrayList1.add("红"+i);
        }
//        System.out.println(arrayList1);
        Collections.shuffle(arrayList1);

        ArrayList<String> arrayList2=new ArrayList();
        for (int i = 1; i <= 16; i++) {
            arrayList2.add("蓝"+i);
        }
        Collections.shuffle(arrayList2);
//        System.out.println(arrayList2);

        ArrayList<String> arrayList3=new ArrayList();
        for (int i = 0; i < arrayList2.size(); i++) {
            arrayList1.add(6,arrayList2.get(i));
        }
//        System.out.println(arrayList1);

        for (int i = 0; i < 7; i++) {
            System.out.print(arrayList1.get(i)+" ");
        }
    }
}
