package com.day09;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入：");
//        int i=scanner.nextInt();
//        System.out.println("输入的值："+i);
//        Scanner scanner1=new Scanner(System.in);
//        System.out.println("请输入：");
        //输入的字符串，如果有空格或者特殊字符不会继续读取
//        String i2=scanner1.next();
        //输入的字符串，读取一行字符串，不会受特殊字符或空格影响
//        String i3=scanner1.nextLine();
//        System.out.println("输入的值："+i3);
        print();
    }
    public static void print(){
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入值：");
            //会使死循环的暂时终止--->scanner.nextInt();
            int sc1=scanner.nextInt();
            System.out.println("输入的1值:"+sc1);
            int sc2=scanner.nextInt();
            System.out.println("输入的2值:"+sc2);
            int sc3=scanner.nextInt();
            System.out.println("输入的3值:"+sc3);

            int temp=sc1>sc2?sc1:sc2;
            int sum=temp>sc3?temp:sc3;
            System.out.println("最大值为："+sum);
            System.out.println("请输入终止字符，n为终止符号：");
            String sc4=scanner.next();
            if (sc4.equals("n")){
                System.out.println("程序终止");
                break;
            }
        }
    }
}
