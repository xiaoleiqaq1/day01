package com.day16;

/*
* 缓冲流，缓冲流
*
* 字节缓冲流----不可以读取中文；
* */

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws Exception{
//        a();
        b();
    }
    public static void a() throws Exception{
//        FileInputStream fis=new FileInputStream("D:\\a.txt");
//        BufferedInputStream bis=new BufferedInputStream(fis);

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\a.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\a\\c.txt"));
        int len;
        byte[] b=new byte[2];
//        bis.read();
        while (true){
            len=bis.read(b);
            if (len==-1){
                break;
            }
            System.out.println(new String(b,0,len));
            bos.write(b);
        }

        bis.close();
        bos.flush();
        bos.close();

    }

    //字符流可以读取中文
    public static void b() throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("D:\\aaa.txt"));

        String len=null;
        while (true){
            len=br.readLine();
            if (len==null){
                break;
            }
            System.out.println(len);
        }
    }
}
