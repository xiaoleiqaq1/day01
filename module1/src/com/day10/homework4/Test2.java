package com.day10.homework4;

import java.util.ArrayList;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //        双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
//        红色球号码从1—33中选择；蓝色球号码从1—16中选择.
//        请随机生成一注双色球号码，例如 红1蓝2
        ArrayList<Integer> redArrayList = new ArrayList<>();
        ArrayList<Integer> blueArrayList = new ArrayList<>();
        Random random = new Random();
//        System.out.println(red);
        while (redArrayList.size() < 6) {
            int red = random.nextInt(33) + 1;
            if (redArrayList.contains(red)) {
                continue;
            } else {
                redArrayList.add(red);
            }
        }
        for (int red : redArrayList) {
            System.out.print("红" + red + " ");
        }
        int blue = random.nextInt(16) + 1;
        System.out.println("蓝" + blue);


    }
}
