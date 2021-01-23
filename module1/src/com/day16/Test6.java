package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test6 {
    public static void main(String[] args) throws Exception{
        a();
    }
    public static void a() throws Exception{
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\b.txt"),"gbk");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\a\\c.txt"),"gbk");

        int len;
        char[] chars=new char[1024];
        while (true){
            len=isr.read(chars);
            if (len==-1){
                break;
            }
//            System.out.println(new String(chars,0,len));
            osw.write(chars);
        }

        //先开后关
        //先开后关
        //先开后关
        osw.flush();
        osw.close();
        isr.close();


    }
}
