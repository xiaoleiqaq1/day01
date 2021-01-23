package com.day09;

public class TestMath {
    public static void main(String[] args) {
//        请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
        int count=0;
        for (double i= Math.ceil(-10.8) ; i<=Math.floor(5.9); i++) {
            if (Math.abs(i)>6 || Math.abs(i)<2.1){
                count++;
            }
        }
        System.out.println(count);//--------------->9个
//        w();
    }
//    public static void w(){
//        double min=-10.8;
//        double max=5.9;
//        int count=0;
//        for(double i=Math.ceil(min);i<Math.ceil(max);i++){
//
//            if(Math.abs(i)>6 || Math.abs(i)<2.1){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
}
