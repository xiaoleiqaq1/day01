package com.day09.homework2;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        获取5个大于等于1小于等于10之间的随机整数，并在控制台打印输出
        Random random=new Random();
        for (int i = 0; i < 5; i++) {
            int r=random.nextInt(10)+1;
            System.out.println(r);
        }
    }
}
