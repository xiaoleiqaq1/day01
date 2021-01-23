package com.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        InputStream();

    }


    public static void InputStream() throws Exception{
        FileInputStream fis=new FileInputStream("D:\\a.txt");
        fis.read();
        fis.close();
    }
    public static void OutputStream() throws Exception{
        //IO流
//        File file=new File("D:\\a.txt");
//        FileOutputStream fos=new FileOutputStream(file);

//        File file=new File("D:\\a.txt");
        FileOutputStream fos=new FileOutputStream("D:\\a.txt");//---默认值为false
//        FileOutputStream fos=new FileOutputStream("D:\\a.txt",true);---为true表示继续追加数据，没有覆盖
//        -------------false,表示覆盖

        //字节流
        //字节流---<byte>
        fos.write('a');
        fos.write(65);//-----A
        //字节流
        fos.write("Hello world".getBytes());
        //换行符号
//        回车符\r和换行符\n ：
//        - 回车符：回到一行的开头（return）。
//        - 换行符：下一行（newline）。
        //换行符号
        fos.write("\r\n".getBytes());

        byte[] b="hello,xiaolei".getBytes();
        //从4个开始，截取长度为3----0,1,2,3
        fos.write(b,3,3);//lo,


        //数据继续追加


        //关闭流
        fos.close();
    }
}
