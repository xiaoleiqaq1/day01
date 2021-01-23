package com.day06.test3;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("王小平",30,"Java");
        teacher.teach();
        Student student=new Student("李小乐",20,90);
        student.test();
    }
}
