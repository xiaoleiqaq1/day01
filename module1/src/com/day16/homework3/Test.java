package com.day16.homework3;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws Exception{
        read("x");
    }
    public static void read(String a) throws Exception{
        FileReader reader=new FileReader("D:\\text.txt");
        char[] chars=new char[2];
        int len;
        int count=0;
        String str=null;
        while (true){
            len=reader.read(chars);
            if (len==-1){
                break;
            }
//            System.out.print(new String(chars));
            str=new String(chars);
            System.out.print(str);
            if (str.contains(a)){
                count++;
            }
        }
        System.out.println();
        System.out.println(a+"出现的次数为:"+count);

        reader.close();
    }
}
