package com.day07.test11.test04;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        //try...catch的快捷键是:  ctrl+alt+T
        try{
            int i=1/0;//虚拟机在这里检测到异常，直接终止了。
//            这行代码不运行，因为检测到异常了。
            System.out.println("hello world");//--->如果捕获异常，此处代码不会执行
            //return 之后不能输出“你好”,可以输出world
            return;
//            System.out.println("你好");
        }catch (ArithmeticException e){
            e.printStackTrace();
            //return之后不能输出world
//            return;
        }

        //如果上面的异常捕获不成功，则这段代码也不会执行。
        //替换成NullPointerException后，这段代码不执行。
        System.out.println("world!!!!!");
    }
}
