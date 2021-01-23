package com.day09;

import java.util.Objects;

public class Test5 {
    public static void main(String[] args) {
        User user=new User("如花",50);
        User user1=new User("如花",50);
//        System.out.println(user);//user对象默认调用toString();方法
//        System.out.println(user.toString());
        //重写toString()方法后，变成json数据，User{name='如花', age=50}
        System.out.println(user.toString());//User{name='如花', age=50}

//        System.out.println(user==user1);//内存地址不同，false
//        System.out.println(user.equals(user1));//内存地址不同，false

        //hashCode()
        System.out.println(user.hashCode()==user1.hashCode());

        //重写equals方法后，比较的是user和user1两个对象的值；
        //name和age相同，所以为true
        System.out.println(user.equals(user1));
        //Objects类也能判断对象是否相等
        System.out.println(Objects.equals(user,user1));

        //Objects类，解决会报空指针异常，java.lang.NullPointerException
        String str=null;
//        boolean b=str.equals("a");//这个会报空指针异常
//        boolean b2="a".equals(str);
        //
        System.out.println(Objects.equals(str,"a"));//false
//        Objects.equals(b,b2);


    }
}
