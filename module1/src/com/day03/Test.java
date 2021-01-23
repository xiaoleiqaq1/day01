package com.day03;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        short c = 10;
        short d = 20;
        int e = 10;
        int f = 10;
        System.out.println(compare(a, b));
        System.out.println(compare(c, d));
        System.out.println(compare(e, f));

//        int[][] m = {{1, 2, 3}, {2, 3, 4}};
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j]+" ");
//            }
//        }
        //String[3][2][2]
//       String[][][] m2 = new String[][][]{{{"1","2"},{"3","4"}},{{"5","6"},{"7","8"}},{{"9","10"},{"11","12"}}};
//       System.out.print(Arrays.deepToString(m2)+" ");


//        int[][] m1 = new int[2][2];
//        m1[0][0] = 1;
//        m1[0][1] = 2;
//        m1[1][0] = 3;
//        m1[1][1] = 4;
//        System.out.println(Arrays.deepToString(m1));

    }
    // 两个byte类型的
//
//    public static boolean compare(byte a, byte b) {
//        System.out.println("byte");
//        return a == b;
//    }

// 两个short类型的

    // 两个short类型的
//    public static boolean compare(short a, short b) {
//        System.out.println("short");
//        return a == b;
//    }

// 两个int类型的
    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;

    }


}
