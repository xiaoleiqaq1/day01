package com.day07.test11.test04;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            int i=1/0;
        } catch (Exception e) {
            e.printStackTrace();
//            return;//即使使用了return;---->finally都会被执行
//            System.exit(0);//使用杀死虚拟机的方法就可以终止finally。
        }finally {
            System.out.println("我是finally代码块！！！");
        }
    }
}
