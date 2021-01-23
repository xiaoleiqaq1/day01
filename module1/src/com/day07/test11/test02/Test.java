package com.day07.test11.test02;

/*匿名内部类的使用场景
 * 通常在方法的形式参数是接口或者抽象类时，也可以将匿名内部类作为参数传递。
 * */

public class Test {
    public static void main(String[] args) {
        //student的实现，普通方法的实现
        Student student = new Student();
        swimTest(student);

        //使用匿名内部类方式,创建了一个匿名的类,该类实现了Swim接口
        Swim swim=new Swim() {
            @Override
            public void swiming() {
                System.out.println("我在自由泳...");
            }
        };
        swim.swiming();

        //第二种方式
        new Swim() {
            @Override
            public void swiming() {
                System.out.println("我在蛙泳...");
            }
        }.swiming();

    }

    //方式，简单方法的调用
    public static void swimTest(Swim s) {
        s.swiming();
    }
}
