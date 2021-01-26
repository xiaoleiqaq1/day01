package com.day17.homework2;


public class Demo {
    public static void main(String[] args) {
        Dong dong=new Dong();
        Thread thread1=new Thread(dong,"第一个人");
        thread1.start();


        Thread thread2=new Thread(dong,"第二个人");
        thread2.start();

        Thread thread3=new Thread(dong,"第三个人");
        thread3.start();

        Thread thread4=new Thread(dong,"第四个人");
        thread4.start();

        Thread thread5=new Thread(dong,"第五个人");
        thread5.start();

        Thread thread6=new Thread(dong,"第六个人");
        thread6.start();

        Thread thread7=new Thread(dong,"第七个人");
        thread7.start();

        Thread thread8=new Thread(dong,"第八个人");
        thread8.start();

        Thread thread9=new Thread(dong,"第九个人");
        thread9.start();

        Thread thread10=new Thread(dong,"第十个人");
        thread10.start();
    }
}
