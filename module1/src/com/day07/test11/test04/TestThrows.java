package com.day07.test11.test04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*抛出异常处理
* */
public class TestThrows {
    public static void main(String[] args)throws Exception{//此处不抛异常就得try...catch
        print();
        //try...catch,抛出异常
        try {
            print2();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
    public static void print() throws ArithmeticException, FileNotFoundException,Exception {
        System.out.println("hello");
        int i=1/0;
        System.out.println("nihao");
        //第二个异常（文件异常）
        FileInputStream file=new FileInputStream("D:\\a.txt");
    }

    public static void print2() throws ArithmeticException{//抛出去
        System.out.println("hello2");
        int i=1/0;
        System.out.println("world");
    }
}
