package com.day09.homework6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        请编写程序，将键盘录入的字符串中敏感字符过滤掉，并测试
//        例如敏感字： 奥巴马
//        键盘输入: 我喜欢奥巴马呀，还喜欢普京
//        打印输出: 我喜欢*呀，还喜欢普京
        String mac="奥巴马";
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串：(我喜欢奥巴马呀，还喜欢普京)");
        String sc=scanner.next();
//        System.out.println(sc);
        String sc1=sc.replace("奥巴马","***");
        String sc2=sc1.replace("牛逼","**");
        System.out.println(sc2);
//        我喜欢***呀，还喜欢普京
    }
}
