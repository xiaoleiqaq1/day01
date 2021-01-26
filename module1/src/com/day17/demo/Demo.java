package com.day17.demo;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
        new Thread(user, "用户A").start();
        new Thread(user, "用户B").start();
    }
}
