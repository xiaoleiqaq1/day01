package com.day16.homework4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入三个字符串：");
        String sc=scanner.next();

        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\data.txt"));
        // 定义字符串,保存读取的一行文字
        String line  = null;
        // 循环读取,读取到最后返回null
        while ((line = br.readLine())!=null) {
//            System.out.print(line);
//            System.out.println("------");
            if (sc.equals(line)){
                System.out.println("验证成功");
                break;
            }
        }
        if (line==null){
            System.out.println("验证失败");
        }
        // 释放资源
        br.close();
    }
}
