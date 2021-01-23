package com.day10.work4;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String sc=scanner.nextLine();
        HashMap<String,Integer> map=new HashMap<>();
//        Integer count=0;
    }
    public void countingKey(HashMap map, String key){
        Integer count=0;
        if (!map.containsKey(key)){
            map.put(key,1);
        }else {
            count++;
        }
    }
}
