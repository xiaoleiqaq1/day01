package com.day03;

import java.util.Arrays;

public class Text7 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {10,20,30,40,50};
        System.arraycopy(arr1,0,arr2,1,2);
        System.out.println(Arrays.toString(arr2));
    }
}
