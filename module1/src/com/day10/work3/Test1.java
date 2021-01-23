package com.day10.work3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sc=scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        charAt(i) 函数 是获取字符串中i位置的字符

        for (int i = 0; i < sc.length(); i++) {
            char c=sc.charAt(i);//获取第i个位置的字符
            if (map.containsKey(c)){
                //获取键的值，即获取相应的次数
                Integer count = map.get(c);
                count++;
                map.put(c,count);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
        StringBuilder builder=new StringBuilder();
//        System.out.println(map.keySet());
//        builder.append(map.keySet()).append(map.get(1));
//        System.out.println(builder);

    }
}
