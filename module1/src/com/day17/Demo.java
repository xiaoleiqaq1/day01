package com.day17;

import org.junit.*;
/*
* 这是junit代码块
* 不能返回类型，如：int，只能用void
* 不能有参数，public void a(int i)---错误
*
* */

public class Demo {

    @Test
    public void a(){
        System.out.println("a的方法");
    }

    @Test
    public void b(){
        System.out.println("b的方法");
    }

    //在每个方法之前调用
    @Before
    public void before(){
        System.out.println("before的方法");
    }

    //在每个方法后调用
    @After
    public void after(){
        System.out.println("after的方法");
    }

    //静态方法====只能被调用一次
    @BeforeClass
    public static void staticBefore(){
        System.out.println("这是静态方法之前，staticBefore");
    }

    @AfterClass
    public static void staticAfter(){
        System.out.println("这是静态方法之后，staticAfter");
    }
}
