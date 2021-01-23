package com.day10.work6;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> number= new ArrayList();
        ArrayList<String> type= new ArrayList();
        ArrayList<String> majiang= new ArrayList();
        //数字1到9
        //必须转换成字符类型
        for (int i = 1; i <= 9; i++) {
            //number.add(String.valueOf(i))//另一种写法
            number.add(i+"");
        }
        type.add("万");
        type.add("筒");
        type.add("条");
        majiang.add("东");
        majiang.add("南");
        majiang.add("西");
        majiang.add("北");
        majiang.add("红中");
        majiang.add("白板");
        majiang.add("发财");
//        System.out.println(type);
//        System.out.println(majiang);
        ArrayList arrayList=new ArrayList();
        //拼接字符：
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < type.size(); j++) {
                arrayList.add(number.get(i)+type.get(j));
            }
        }
        //获得总麻将数量
        arrayList.addAll(majiang);
//        System.out.println(arrayList);
        ArrayList<String> majiang1= new ArrayList();
        for (int i = 0; i < 4; i++) {
            majiang1.addAll(arrayList);
        }
//        System.out.println(majiang1.size());

        //发牌-----
        //打乱发牌顺序。。。
        Collections.shuffle(majiang1);
        System.out.println(majiang1);


        //4个玩家：
        ArrayList<String> play1=new ArrayList<>();
        ArrayList<String> play2=new ArrayList<>();
        ArrayList<String> play3=new ArrayList<>();
        ArrayList<String> play4=new ArrayList<>();


//        *关键。。。i/4%4  ----
//
//        i   /4     %4
//        0   0      0
//        1   0      0
//        2   0      0
//        3   0      0

//        4   1      1
//        5   1      1
//        6   1      1
//        7   1      1
//
//        8   2      2
        for (int i = 0; i < 48; i++) {
            if (i/4%4==0){
                play1.add(majiang1.get(i));
            }else if (i/4%4==1){
                play2.add(majiang1.get(i));
            }else if (i/4%4==2){
                play3.add(majiang1.get(i));
            }else if (i/4%4==3){
                play4.add(majiang1.get(i));
            }
        }

        play1.add(majiang1.get(48));
        play2.add(majiang1.get(49));
        play3.add(majiang1.get(50));
        play4.add(majiang1.get(51));
        play1.add(majiang1.get(52));


        System.out.println("玩家1"+play1);
        System.out.println("玩家2"+play2);
        System.out.println("玩家3"+play3);
        System.out.println("玩家4"+play4);
    }
}
