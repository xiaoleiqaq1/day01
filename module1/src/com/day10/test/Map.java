package com.day10.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

public class Map {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap();
        hashMap.put("杨过","小龙女");
        hashMap.put("武大郎","潘金莲");
        hashMap.put("王宝强","马蓉");
        hashMap.put("贾乃亮","李小璐");
        hashMap.put("贾乃亮","李小璐");//key重复会覆盖掉
        hashMap.get("贾乃亮");
        System.out.println(hashMap.get("武大郎"));//获取键中相应的值
        //所有的集合
//        System.out.println(hashMap);
//
//        System.out.println(hashMap.get("贾乃亮"));//根据键取value值。
//        System.out.println(hashMap.keySet());//获取Map集合中所有的键
////        System.out.println(hashMap.keySet("王宝强"));//获取Map集合中所有的键
//
//        System.out.println(hashMap.containsKey("贾乃亮"));//判断集合中是否包含指定的键、、true
//        System.out.println(hashMap.containsValue("马蓉"));//判断集合中是否包含指定的值、、true

        //遍历方式：第一种
        Set<String> set=hashMap.keySet();
        System.out.println(set);//输出键key
        for (String str:set){
            System.out.println("键："+str+" 值："+hashMap.get(str));//重点理解
        }

        //迭代器也可以
//        Iterable

//        Map集合遍历键值对方式
        Set<Entry<String,String>> set1=hashMap.entrySet();

    }
}
