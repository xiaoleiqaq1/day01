package com.day03;

public class Test5 {
    public static void main(String[] args) {
        double length=10;
        double width=20;
        System.out.println(fun(length,width));
        System.out.println(fun1(length,width));
    }
    public static double fun(double length,double width){
        System.out.println("长方形的周长");
        return (length+width)*2;
    }
    public static double fun1(double length,double width){
        System.out.println("长方形的面积");
        return length*width;
    }
}
