package com.day03;


import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] a = {99, 100, 98, 97, 96};
        //从小到大排序a
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //定义一个与a匹配的数组；
        int[] b = new int[a.length - 2];
        //把a的a.length-2复制到b中；
        System.arraycopy(a, 1, b, 0, a.length - 2);
        System.out.println(Arrays.toString(b));
        //算总和，再除以a.length-2的长度；
        double temp = 0;
        for (int i = 0; i < a.length - 2; i++) {
            temp += b[i];
        }
        double pingjunfen = temp / (a.length - 2);
        System.out.println(a.length+"个人的平均分为："+pingjunfen);

    }
}
