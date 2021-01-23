package com.day03;

public class Test4 {
    public static void main(String[] args) {
        int[] arr={95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        double pingjunfen =temp/(arr.length);
        System.out.println(pingjunfen);
        //统计高于平均分的分数有多少个。
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>pingjunfen){
                sum+=1;
            }
        }
        System.out.println("高于平均分"+pingjunfen+"的个数有"+sum);
    }
}
