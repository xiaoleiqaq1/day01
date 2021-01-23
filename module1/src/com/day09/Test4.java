package com.day09;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int r=random.nextInt(100)+1;
        while(true){
            System.out.println("请输入值：");
            int a=scanner.nextInt();
            if (a>r){
                System.out.println("大了");
            }else if (a<r){
                System.out.println("小了");
            }else{
                System.out.println("猜中了，游戏结束，值："+r);
                break;
            }

        }
    }
}
