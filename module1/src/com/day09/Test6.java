package com.day09;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        String str="abcde";

        //public char[] toCharArray () ：将此字符串转换为新的字符数组。
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+",");
        }
        System.out.println(Arrays.toString(chars));
        System.out.println("------------");

        //public String replace (CharSequence target, CharSequence replacement) ：
        // 将与target匹配的字符串使用replacement字符串替换。
        String str2="HelloWorld";
        String str3 = str2.replace("l", "xxx");
        System.out.println(str2);   //注意，replace会返回一个新的字符串，新字符串才是被替换后的。这里输出HelloWorld
        System.out.println(str3);   //HexxxxxxoWorxxxd

        //分割功能
        String string="你好,我叫张三,我的兴趣爱好是:打篮球";
        String[] strs = string.split(","); //你好   我叫张三   我的兴趣爱好是:打篮球
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }
}
