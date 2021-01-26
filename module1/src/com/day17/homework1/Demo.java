package com.day17.homework1;

public class Demo {
    public static Integer num = 500;

    public static void main(String[] args) {
        Demo demo = new Demo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (demo) {
                        if (num <= 0) {
                            break;
                        }
                        System.out.print("团");
                        System.out.print("战");
                        System.out.print("可");
                        System.out.print("以");
                        System.out.print("输");
                        System.out.println();
                        num--;
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (demo) {
                        if (num <= 0) {
                            break;
                        }
                        System.out.print("提");
                        System.out.print("莫");
                        System.out.print("必");
                        System.out.print("须");
                        System.out.print("死");
                        System.out.println();
                        num--;
                    }
                }
            }
        }).start();
    }
}
