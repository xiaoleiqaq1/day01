package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test7 {
    public static void main(String[] args) throws Exception{
        System.out.println("hello world");
        /*
        *  java.io.NotSerializableException: com.day16.Student
        *
        * */

        Student student=new Student(1,"小雷",20);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\aaa.txt"));
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\aaa.txt"));
        oos.writeObject(student);
//        System.out.println("-----");
        Student stu=(Student)ois.readObject();
        System.out.println(stu);

        ois.close();
        oos.flush();
        oos.close();
    }
}
