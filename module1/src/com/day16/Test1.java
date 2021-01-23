package com.day16;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {

        //递归调用
//        int num=sum(5);
//        System.out.println(num);

        File files=new File("D://a");
        getFile(files);
    }
    public static int sum(int i){
        if (i<=0){
            return 0;
        }
//        int number=sum(i);
        return i+sum(--i);
    }

    //递归调用
    public static void getFile(File files){
//        - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
//        - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

        File[] file=files.listFiles();
        for (File file1:file){
            if (file1.isFile()){
                if (file1.getName().endsWith(".txt"))
                System.out.println("文件名："+file1);
            }else{
                getFile(file1);
            }
        }
    }

    //字节流------------
    //字节输出流---
    public static void outPutStream(){

    }
}
