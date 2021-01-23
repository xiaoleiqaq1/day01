package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("D:\\1.png");
            String string="D:\\"+System.currentTimeMillis()+".png";
            fos=new FileOutputStream(string);

            byte[] b=new byte[1024];
            int len;
            while (true){
                len=fis.read(b);
                if (len==-1){
                    break;
                }
                fos.write(b,0,len);
//                System.out.println(new String(b,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos!=null){
                    fos.close();
                }
                if (fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
