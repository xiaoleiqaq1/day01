package com.day10.work1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入四种水果：(苹果，香蕉，西瓜，橘子)");
        Scanner scanner=new Scanner(System.in);
        String sc1=scanner.next();
        String sc2=scanner.next();
        String sc3=scanner.next();
        String sc4=scanner.next();

        String[] strings1=sc1.split("，");
        String[] strings2=sc2.split("，");
        String[] strings3=sc3.split("，");
        String[] strings4=sc4.split("，");

        Map<String,String> map=new HashMap<>();
        map.put(strings1[0],strings1[1]);
        map.put(strings2[0],strings2[1]);
        map.put(strings3[0],strings3[1]);
        map.put(strings4[0],strings4[1]);
//        System.out.println(map.get("01"));

//        map的遍历
//        Set<String> keys=map.keySet();
//        System.out.println(keys);
//        String[] arr=new String[];
//        for (Integer key1:keys){
//            arr[key1]=key1;
//        }

//        录入完毕后可以根据商品编号查询出商品信息
        //键已经是字符串了，所以必须定义为String类型去接收。
        System.out.println("请输入商品编号(01-04)");
        String str=scanner.next();
//        System.out.println(str);
//        if (map.containsKey(str))
        ////////无序中关键元素：containKey方法
        if (map.containsKey(str)){
            System.out.println("商品信息为：" + map.get(str));
        }else {
            System.out.println("查无此商品");
        }
//        Set<String> keys=map.keySet();
//        String[] arr={};
//        Iterator<String> it = keys.iterator();
//        for (int i = 0; i <keys.size()+2; i++) {
//            //  泛型指的是 迭代出 元素的数据类型
//            while(it.hasNext()){ //判断是否有迭代元素
//                arr[i]= it.next();//获取迭代出的元素
//                System.out.println(arr[i]);
//            }
//        }

//        for (String key:keys){
//            String value=map.get(key);
////            System.out.println("key"+key+",值:"+value);
//            if (str.equals(value)) {
//                System.out.println("商品信息为：" + map.get(str));
//            } else {
//                System.out.println("查无此商品");
//            }
//        }

    }
}
