package com.day10.homework2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner=new Scanner(System.in);
        String sc=scanner.nextLine();
        //将字符串转换成char[]类型
        char[] chars=sc.toCharArray();

        HashSet<Character> hashSet=new HashSet();
        for (int i = 0; i < chars.length; i++) {
            hashSet.add(chars[i]);
        }
        System.out.println(hashSet);
        //将HashSet集合转换成ArrayList
        List<Character> list = new ArrayList(hashSet);
        //排序Collection中的排序。
        Collections.sort(list);
        System.out.println(list);
    }
}
