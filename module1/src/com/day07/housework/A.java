package com.day07.housework;

public interface A {
    //接口中含有抽象方法，默认方法和静态方法
    //含有私有方法和私有静态方法、
    public abstract void showA();
    default void showB(){
        System.out.println("展示showB()方法！！！");
    }
}
