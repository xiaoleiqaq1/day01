package com.day16.homework4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入三个字符串：");
            String sc=scanner.next();
            fis = new FileInputStream("D:\\data.txt");
            int len;
            String string;
            byte[] chars=new byte[3];
            while (true){
                len=fis.read(chars);
                string=new String(chars);
                if (len==-1){
                    break;
                }
//                System.out.println(new String(chars));
//                System.out.println(string);
                if (sc.equals(string)){
                    System.out.println("验证成功");
                }else{
                    System.out.println("验证失败");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
