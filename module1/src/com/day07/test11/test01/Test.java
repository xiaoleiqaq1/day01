package com.day07.test11.test01;
//        匿名内部类的本质：
//        1. 定义一个没有名字的内部类
//        2. 这个类实现了Swim接口
//        3. 创建了这个没有名字的类的对象

public class Test {
    public static void main(String[] args) {
        //匿名局部内部类的调用方式（第一种）
        /*
        * new Swim()代表着实现这个接口的子类对象---> package com.day07.test11;中的Swiming隐藏了
        * 把Swiming这个类隐藏掉了，所以就叫匿名内部类。
        * 这个类在方法里面叫匿名局部内部类。
        * */
        Swim swim=new Swim(){
            @Override
            public void swiming() {
                System.out.println("狗爬式游泳");
            }
        };
        swim.swiming();

        //匿名局部内部类的调用方式（第二种）
        new Swim(){
            @Override
            public void swiming() {
                System.out.println("狗爬式游泳11");
            }
        }.swiming();
    }
}
