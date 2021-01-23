package com.day04;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //冒泡法，每次循环都取最大值塞到后面；循环次数n*(n-1)次
        int[] arr={1,87,25,18};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int temp=0;
                if (arr[j]>arr[j+1]){
                    temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
