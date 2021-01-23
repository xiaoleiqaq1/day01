package com.day16;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        File file=new File("D:\\a.txt");
        if (file.exists()){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }

        System.out.println(file.getAbsolutePath());//D:\a.txt
        System.out.println(file.getPath());//D:\a.txt
        System.out.println(file.getName());//a.txt
        System.out.println(file.length());//10---空格不算字符


        // 判断是文件还是目录
        System.out.println("d:\\a 文件?:"+file.isFile());//true
        System.out.println("d:\\a 目录?:"+file.isDirectory());//false


        // 文件的创建---createNewFile
        File f = new File("D:\\aaa.txt");
        System.out.println("是否存在:"+f.exists()); // false
        System.out.println("是否创建:"+f.createNewFile()); // true
        System.out.println("是否存在:"+f.exists()); // true
        System.out.println(f.getAbsolutePath());

        // 目录的创建----mkdir/mkdirs
        File f2= new File("D:\\a");
        System.out.println("是否存在:"+f2.exists());// false
        System.out.println("是否创建:"+f2.mkdir());	// true
        System.out.println("是否存在:"+f2.exists());// true



    }
}
