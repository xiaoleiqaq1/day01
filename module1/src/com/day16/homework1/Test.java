package com.day16.homework1;

public class Test {
    public static void main(String[] args) {
       int sum= num(100);
        System.out.println(sum);
    }
    public static int num(int i){
        if (i<=0){
            return 0;
        }
        return i+num(i-2);
    }

}
