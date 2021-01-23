package com.day07.test11.test04;

public class TestThrow {
    public static void main(String[] args) {
        /*定义数组的三种方式：
        * int [] arr={1,2,3};
        *
        * int [] arr1=new int [3];
        * arr1[0]=1;arr1[1]=2;arr1[3]=3;
        *
        * int [] arr2=new int[]{1,2,3};
        * */
        try {
            int [] arr={1,2,3};
        } catch (Exception e) {
            e.printStackTrace();
        }
        print(0);
    }
    public static void print(int a){
        System.out.println("helloworld");
        if (a==0){
            throw new ArithmeticException("0不能做除数");
        }
        int i=1/0;
        System.out.println("hello");

    }
}
