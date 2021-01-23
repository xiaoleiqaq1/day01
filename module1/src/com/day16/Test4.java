package com.day16;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
*
* //字符输入流
* 字符输入流
*
* */

public class Test4 {
    public static void main(String[] args) {
        //字符输入流
        fileReader();
//        fileWrite();
    }
    public static void fileReader(){
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader=new FileReader("D:\\a.txt");
            fileWriter=new FileWriter("D:\\a\\a.txt");
            int len=0;

            char[] chars=new char[2];
//            fileReader.read();
            while (true){
                len=fileReader.read(chars);
                if (len==-1) {
                    break;
                }
                System.out.println(new String(chars,0,len));
                fileWriter.write(chars,0,len);
            }
            // 定义字符数组，作为装字符数据的容器
//            char[] cbuf = new char[2];
//            // 循环读取
//            while ((len = .read(cbuf))!=-1) {
//                System.out.println(new String(cbuf));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter!=null){
                    fileWriter.flush();
                    fileWriter.close();
                }
                if (fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //字符流的写入操作

    public static void fileWrite(){
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter("D:\\a.txt");
            fileWriter.write("我是中国人");

            char[] chars="我是中国人吧".toCharArray();
            fileWriter.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
