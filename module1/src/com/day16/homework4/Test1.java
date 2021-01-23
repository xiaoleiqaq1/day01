package com.day16.homework4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("D:\\data.txt");
        FileInputStream fis = new FileInputStream("D:\\data.txt");

        System.out.println("请输入要三个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedInputStream bis = new BufferedInputStream(fis);
        fos.write(str.getBytes());

        System.out.println("请输入要校验的验证码");
        Scanner s = new Scanner(System.in);
        String sts = s.next();

        int len;
        byte[] by = new byte[1024];
        while ((len = bis.read(by)) != -1) {
            String q = new String(by);
            if (q.contains(sts)) {
                System.out.println("验证成功");
            } else {
                System.out.println("验证失败");
            }
        }
        bos.close();
        bis.close();
        fis.close();
        fos.close();
    }
}
