package com.day17.day17;

public class Demo4 {
    public static void main(String[] args) {

        Ticket ticket=new Ticket();
        Thread thread1=new Thread(ticket,"一号窗口");
        Thread thread2=new Thread(ticket,"二号窗口");
        Thread thread3=new Thread(ticket,"三号窗口");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
