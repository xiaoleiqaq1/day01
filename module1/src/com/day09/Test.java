package com.day09;

public class Test {
    public static void main(String[] args) {
        Integer i=1;
        Integer i2=new Integer(1);
        Integer i3=Integer.valueOf(1);
        //包装对象---->基本数值
        int num=i.intValue();
//        基本类型转换为String
        String str=20+"";
        String string=new String("20");
//        System.out.println(string);
        String str1=String.valueOf(30);

//        String转换成对应的基本类型
        int i1=Integer.parseInt("1000");
        boolean bool=Boolean.parseBoolean("200");
        float floa=Float.parseFloat("2");

        System.out.println(System.currentTimeMillis());

    }
}
