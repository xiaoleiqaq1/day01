package com.day05.games;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Player的对象,设置人类和电脑的分数为0
        Player player=new Player();
        player.setComputerScore(0);
        player.setPlayerScore(0);
        //人类玩家
        Person person=new Person();
//        电脑玩家
        Games games=new Games();
        Test test=new Test();


        int score=0;
//        请输入人出的石头----1,剪刀-----2,布-----3：
        while (true){
            int p1=person.play();
            int pc=games.play();
            String finger=test.changeFinger(p1);
            String finger1=test.changeFinger(pc);

            if (p1==pc){
                person.setPlayerScore(person.getPlayerScore()+1);
                games.setComputerScore(games.getComputerScore()+1);
                score=1;
            } else if ((pc==1 && p1==3) || (pc==3 && p1==2) || (pc==2 && p1==1)){
                person.setPlayerScore(person.getPlayerScore()+3);
                games.setComputerScore(games.getComputerScore()-3);
                score=3;
            }else {
                person.setPlayerScore(person.getPlayerScore()-3);
                games.setComputerScore(games.getComputerScore()+3);
                score=-3;
            }
            System.out.println("人类出的拳:"+finger+"  电脑出的拳:"+finger1);
            System.out.println("人类在本轮得分为："+score);
            System.out.println("本轮结束，任意键开始，结束按N：");
            Scanner scanner=new Scanner(System.in);
            String scan=scanner.next();
            if (scan.equals("N")){
                break;
            }
            System.out.println("=====================");
            System.out.println("本轮重新开始");
//            if (scan.equals("Y")){
//                continue;
//            }else if(scan.equals("N")){
//                break;
//            }
        }
        System.out.println("人类玩家最终的分数："+person.getPlayerScore());
        System.out.println("电脑玩家最终的分数："+games.getComputerScore());
        if (person.getPlayerScore()>games.getComputerScore()){
            System.out.println("人类玩家赢了");
        }else if (person.getPlayerScore()==games.getComputerScore()){
            System.out.println("最终为平局");
        } else{
            System.out.println("电脑玩家赢了");
        }
    }
    //把传入的数字转换成石头，剪刀和布，
    public String changeFinger(int personGame){
        String fingerStr = "";
        switch(personGame){
            case 1:
                fingerStr = "石头";
                break;
            case 2:
                fingerStr = "剪刀";
                break;
            case 3:
                fingerStr = "布";
                break;
        }
        return fingerStr;
    }
}
