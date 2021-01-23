package com.day07.test11.test03;

public class Test {
    public static void main(String[] args) {
//        new Start(new Task() {
//            @Override
//            public void task() {
//                System.out.println("开启任务啦！");
//            }
//        }).run();
        new Start(() -> {
            System.out.println("使用lambda表达式开启任务！");
        }).run();
    }
}
