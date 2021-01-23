package com.day07;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        Player player=new Player();
        player.setComputerScore(0);
        player.setPersonScore(0);
//        System.out.println(person.run());
        Computer computer=new Computer();
        Test test=new Test();
//        System.out.println(computer.run());

        int score=0;
        while (true){
            int p1=person.run();
            int pc=computer.run();
            String personfinger=test.getFinger(p1);
            String computerfinger=test.getFinger(pc);

            if (p1==pc){
                person.setPersonScore(person.getPersonScore()+1);
                person.setComputerScore(person.getComputerScore()+1);
                score=1;
            }else if ((pc==1 && p1==3) || (pc==3 && p1==2) || (pc==2 && p1==1)){
                person.setPersonScore(person.getPersonScore()+3);
                person.setComputerScore(person.getComputerScore()-3);
                score=3;
            }else {
                person.setPersonScore(person.getPersonScore()-3);
                person.setComputerScore(person.getComputerScore()+3);
                score=-3;
            }
            System.out.println("人类在本轮出的拳："+personfinger+" ,电脑在本轮出的拳:"+computerfinger);
            System.out.println("人类在本局的得分："+score);
            System.out.println("本轮结束，任意键开始，结束按N：");
            Scanner scanner=new Scanner(System.in);
            String sc=scanner.next();
            if (sc.equals("N")){
                break;
            }
            System.out.println("=====================");
            System.out.println("本轮重新开始");

        }
        System.out.println("人类玩家最终的分数："+person.getPersonScore());
        System.out.println("电脑玩家最终的分数："+computer.getComputerScore());

        if (person.getPersonScore()>computer.getComputerScore()){
            System.out.println("人类玩家赢了");
        }else if (person.getPersonScore()==computer.getComputerScore()){
            System.out.println("最终为平局");
        } else{
            System.out.println("电脑玩家赢了");
        }
    }
    public String getFinger(int finger){
        String getfinger="";
        switch (finger){
            case 1:
                getfinger="石头";
                break;
            case 2:
                getfinger="剪刀";
                break;
            case 3:
                getfinger="布";
                break;
        }
        return getfinger;
    }
}
