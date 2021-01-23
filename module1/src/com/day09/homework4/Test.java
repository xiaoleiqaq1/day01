package com.day09.homework4;

public class Test {
    public static void main(String[] args) {

//        1. 比较str1和str2内容是否相等,比较str1和str3内容是否相等
//        2. 忽略大小写比较str1和str3内容是否相等
//        3. 测试str1字符串是否以"He"前缀开头,测试str1字符串是否以"abc"前缀开头
//        4. 测试str1字符串是否以"o"后缀结尾,测试str1字符串是否以"l"后缀结尾

        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";

        System.out.println(str1==str2);//false,地址比较，
        System.out.println(str1.equals(str2));//true，值比较
        System.out.println(str1==str3);//false,地址比较，
        System.out.println(str1.equals(str3));//flase
        System.out.println("------------");
//        2. 忽略大小写比较str1和str3内容是否相等
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true
//        3. 测试str1字符串是否以"He"前缀开头,测试str1字符串是否以"abc"前缀开头
//        System.out.println(str1.indexOf("He"));//-1
//        System.out.println(str1.indexOf("abc"));//-1

//        public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到
//        endIndex截取字符串。含beginIndex，不含endIndex。
//        System.out.println(str1.substring(2,5));//不包括5

        System.out.println("-------------");
//        3. 测试str1字符串是否以"He"前缀开头,测试str1字符串是否以"abc"前缀开头
        System.out.println(str1.startsWith("He"));//false
        System.out.println(str1.startsWith("abc"));//true
        System.out.println(str1.startsWith("he"));//true
//        4. 测试str1字符串是否以"o"后缀结尾,测试str1字符串是否以"l"后缀结尾
        System.out.println("-------------");
        System.out.println(str1.endsWith("o"));//true
        System.out.println(str1.endsWith("l"));//false
    }
}
