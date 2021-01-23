package com.day09.homework8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入登录日期(2013-6-8) 格式：yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(sc);
        long brithdayTime = birthdayDate.getTime();
        //获取出生日期
//        System.out.println(birthdayDate);


//        2015年9月1日-2016年3月3日未登录
        String str1 = "2015-9-1";
        Date str11 = sdf.parse(str1);
//        System.out.println(str11);
        long strTime1 = str11.getTime();
//        System.out.println(strTime1);
        String str2 = "2016-3-3";
        Date str122 = sdf.parse(str2);
//        System.out.println(str122);
        long strTime2 = str122.getTime();
        //总和：
        long strTime = strTime2 - strTime1;
//        System.out.println(strTime);

//        当前日期时间//Wed Jan 13 20:49:18 CST 2021
        Date date = new Date();
//        System.out.println(date);
        long date1 = date.getTime();

        //登录时间总和：
        long endTime = date1 - strTime - brithdayTime;
//        System.out.println(endTime);
        //替换成天数
        long endTime1 = endTime / 1000 / 60 / 60 / 24;
        System.out.println("登录总天数：" + endTime1);
//        (n+2)^2-4=2593
//        float math=(float)Math.sqrt(endTime1+4)-2.f;
//        QQ等级
        //sqrt()求平方根
        int math = (int) Math.sqrt(endTime1 + 4) - 2;
        //QQ皇冠为：
        int math11 = math / 64;
        //QQ太阳为:
        int math1 = (math - math11 * 64) / 16;
        //QQ月亮数为：
        int math2 = (math - math11 * 64 - math1 * 16) / 4;
//        QQ星星数为：
        int math3 = math - math11 * 64 - math1 * 16 - math2 * 4;
        System.out.println("QQ等级为：" + math + "等级");
        System.out.println("QQ皇冠为：" + math11 + "个， QQ太阳为：" + math1 + "个, QQ月亮为:" + math2 + "个， QQ星星为:" + math3 + "个");
    }
}
