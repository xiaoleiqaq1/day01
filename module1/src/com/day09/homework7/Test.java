package com.day09.homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        有如下字符串:"javajfifiewjavajfifiowfjavagkljjava",定义方法统计出该字符串中"java"字符串的数量
//        public char charAt (int index) ：返回指定索引处的 char值。

//        Scanner scanner=new Scanner(System.in);
//        只能统计当个字符的数量
//        String str="javajfifiewjavajfifiowfjavagkljjava";
//        int count=0;
//        for (int i = 0; i < str.length(); i++) {
//            char c=str.charAt(i);
//            if (c=='j'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        遍历法
//        有如下字符串:"javajfifiewjavajfifiowfjavagkljjava",定义方法统计出该字符串中"java"字符串的数量
        String string = "javajfifiewjavajfifiowfjavagkljjava";
        String ja = "java";
        num(string, ja);


//        System.out.println(getCount(string,ja));
        //返回指定子字符串第一次出现在该字符串内的索引。
//        System.out.println(string.indexOf("java"));

    }

    //替换法replace
    public static void num(String string, String a) {
        int i = string.length() - string.replace(a, "").length();
        System.out.println("java字符串个数:" + i / a.length());
    }
    //教材中的方法
    public static int getCount(String str, String ch) {
        // 3.在getCount方法中定义一个int类型变量count，用来记录查找到ch字符串的次数
        int count = 0;
         // 4.使用while循环,循环条件是:str.indexOf(ch) != ‐1
        while (str.indexOf(ch) != -1) {// 说明查找到了字符串ch
          // 5.在while循环里面定义一个int类型变量,用于记录ch字符串在str字符串中的索引
            int index = str.indexOf(ch);
//            System.out.println(index);//0 7 8 4
       // 6.在while循环里面将str字符串从(ch索引位置加ch长度)位置开始截取,截取到str末尾
            str = str.substring(index + ch.length());
            // 7.在while循环里面计数器count++
            count++;
        }
        // 8.返回count
        return count;
    }

}
