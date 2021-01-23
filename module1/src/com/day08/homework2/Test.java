package com.day08.homework2;


public class Test {
    public static void main(String[] args) {
        try {
            print("admin","admin");
            System.out.println("账户和密码都没有问题！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    ///'UserException' is abstract; cannot be instantiated
    //RuntimeException
    public static void print(String name, String password) {
        if (name != "admin") {
            throw new UserException("用户名不存在");
        } else if (password != "admin") {
            throw new UserException("密码错误 ");
        } else {
            System.out.println("欢迎"+name);
        }
    }
}
