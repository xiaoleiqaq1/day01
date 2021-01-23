package com.day09;

public class Test7 {
    public static void main(String[] args) {
        User user01 = new User("Mark", 23);
        User user02 = new User("Mark", 23);
        // 得到两个对象的hashCode值比较它们是否相等
        int hashCode1 = user01.hashCode();
        int hashCode2 = user02.hashCode();
        System.out.println(hashCode1 == hashCode2);

        //获取当前系统的时间
        System.out.println(System.currentTimeMillis());
    }
}
