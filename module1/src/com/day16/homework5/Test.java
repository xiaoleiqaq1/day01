package com.day16.homework5;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception{

        //缓冲字节流--------缓冲字节流
        copy();
    }
    public static void copy() throws Exception{
        long start =System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\jdk-8u271-windows-x64.exe"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\a\\jdk-8u271-windows-x64.exe"));
        int len;
        byte [] bytes=new byte[1024*5];
        while (true){
            len=bis.read(bytes);
            if (len==-1){
                break;
            }
            bos.write(bytes,0,len);
        }
        bos.flush();
        bos.close();
        bis.close();

        long end=System.currentTimeMillis();
        System.out.println("运行总时间:"+(end-start));
    }
}
