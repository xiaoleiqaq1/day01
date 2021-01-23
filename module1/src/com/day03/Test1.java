package com.day03;

public class Test1 {
    public static void main(String[] args) {
        int[] a={1,2,5,4};
        int[] b={1,2,5,4};
        System.out.println(equalst(a,b));
    }

    public static boolean equalst(int[] arr1, int[] arr2) {
//        if (arr1.length == arr2.length) {
//            for (int i = 0; i < arr1.length; i++) {
//                if (arr1[i] != arr2[i]){
//                    return false;
//                }
//            }
//        } else if (arr1.length != arr2.length) {
//            return false;
//        }
//        return true;
        int count=0;
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]==arr2[i]){
                    count++;
                }
            }
        }else if (arr1.length != arr2.length){
            return false;
        }
        return true;
    }
}
