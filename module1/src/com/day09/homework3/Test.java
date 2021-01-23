package com.day09.homework3;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random=new Random();

//如果要生成[X,Y)区间的正数，nextInt()方法参数放它们的差值，然后加上X
//        int n3 = r.nextInt（Y-X）+X；
        //如果要生成5-8的话，[0-3)+5;
        //100000-1000000
//        模拟银行发送的随机数字验证码，随机生成一个6位的整数，并在控制台打印输出
        int r=random.nextInt(1000000-100000)+100000;
        System.out.println(r);
    }
}
