package com.day09.homework5;

public class Test {
    public static void main(String[] args) {
//        题目：
//        1. 打印8的绝对值
//        2. 打印-9的绝对值
//        3. 打印6.1向上取整的值
//        4. 打印-6.1向上取整的值
//        5. 打印6.8向下取整的值
//        6. 打印-6.8向下取整的值
//        7. 打印5.88四舍五入的值
//        8. 打印-5.88四舍五入的值
        double d1=Math.abs(8);//8.0
        double d2=Math.abs(-9);//9.0
        double d3=Math.ceil(6.1);//7.0
        double d4=Math.ceil(-6.1);//-6.0

        double d5=Math.floor(6.8);//6.0
        double d6=Math.floor(-6.8);//-7.0

        double d7=Math.round(5.88);//6.0
        double d8=Math.round(-5.88);//-6.0

        double d9=Math.round(-5.5);//-5.0
        System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9);


    }
}
