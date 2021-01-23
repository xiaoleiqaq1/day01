package com.day09.homework;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//        键盘录入三个数据,获取这三个数的最大值
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个值：");
        int a=scanner.nextInt();
        System.out.println("请输入第二个值：");
        int b=scanner.nextInt();
        System.out.println("请输入第三个值：");
        int c=scanner.nextInt();
        int temp=a>b?a:b;
        int sum=temp>c?temp:c;
        System.out.println("输入的三个数最大值为"+sum);
    }
}
