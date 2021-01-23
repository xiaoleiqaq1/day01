package com.day09;

public class Test3 {
    public static void main(String[] args) {
        double d1=Math.abs(-5);
        System.out.println("abs为绝对值："+d1);
//        double d2=Math.abs(5);
        //向上取整
        double d2=Math.ceil(3.3);
        System.out.println("正数取ceil的最大值为："+d2);//4.0
        double d3=Math.ceil(-3.3);
        System.out.println("负数的最大值为："+d3);//-3.0

        //向下取整
        double d4=Math.floor(3.3);
        System.out.println("正数取floor的最大值为："+d4);//3.0
        double d5=Math.floor(-3.3);
        System.out.println("负数的最大值为："+d5);//-4.0
        //四舍五入法
        double d6=Math.round(3.3);
        double d7=Math.round(3.5);
        System.out.println("正数取round的最大值为："+d6);//3.0
        System.out.println("正数取round的最大值为："+d7);//4.0
        double d8=Math.round(-3.3);
        //注意负数-3.5
        double d9=Math.round(-3.5);
        double d10=Math.round(-3.6);
        System.out.println("负数的最大值为："+d8);//-3.0
        System.out.println("负数的最大值为："+d9);//-3.0
        System.out.println("负数的最大值为："+d10);//-4.0
    }
}

