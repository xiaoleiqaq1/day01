package com.day16.homework2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入文件路径：(D:\\a)");
//        String sc=scanner.next();

//        File file=new File(sc);
        File file=new File("D:\\a");
        getfile(file);
//        Map<String,Integer> map=new HashMap<>();
    }


    public static void getfile(File file){
        //file.listFiles();-----表示该File目录中的所有的子文件或目录。
        File[] files=file.listFiles();
        for (File file1:files){
//            System.out.println(file1);
            if(file1.isFile()){
                if(file1.getName().endsWith(".txt")){
                    System.out.println("我是文件"+file1);
                }
            }else {
                getfile(file1);
            }
        }
    }
}
