package com.day10.homework6;

/*
* 斗地主
*
* */

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> card=new ArrayList<>();
        ArrayList<String> number=new ArrayList<>();
        ArrayList<String> num=new ArrayList<>();
        for (int i = 2; i < 11; i++) {
            number.add(i+"");
        }
//        System.out.println(number);
        card.add("♠");
        card.add("♥");
        card.add("♣");
        card.add("♦");
        number.add("A");
        number.add("J");
        number.add("Q");
        number.add("K");
        //拼接起来
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < card.size(); j++) {
                num.add(number.get(i)+card.get(j));
            }
        }
        num.add("大王");
        num.add("小王");
        Collections.shuffle(num);
//        System.out.println(num);
        //发牌
//        创建 三个 玩家集合  创建一个底牌集合
        ArrayList<String> player1 = new ArrayList();
        ArrayList<String> player2 = new ArrayList();
        ArrayList<String> player3 = new ArrayList();
        ArrayList<String> dipai = new ArrayList();
        for (int i = 0; i < 54; i++) {
            //先取出三张底牌 51 52 53
            if (i>50){
                dipai.add(num.get(i));
            }else{
                if (i%3==0){
                    player1.add(num.get(i));
                }else if (i%3==1){
                    player2.add(num.get(i));
                }else {
                    player3.add(num.get(i));
                }
            }
        }
        System.out.println("玩家1"+player1);
        System.out.println("玩家2"+player2);
        System.out.println("玩家3"+player3);
        System.out.println("底牌"+dipai);
    }
}
