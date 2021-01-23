package com.day05.games;

import java.util.Scanner;

public class Person extends Player{
    private int personGames;

    public Person() {
    }


    public Person(int computerScore, int playerScore, int personGames) {
        super(computerScore, playerScore);
        this.personGames = personGames;
    }

    public int getPersonGames() {
        return personGames;
    }

    public void setPersonGames(int personGames) {
        this.personGames = personGames;
    }
//重写玩家的方法
    @Override
    public int play() {
//        super.play();
        System.out.println("请输入人出的石头-1,剪刀-2,布-3：");
        Scanner scanner=new Scanner(System.in);
        int personGame = scanner.nextInt();
//        System.out.println(personGame);
        return personGame;
    }
}
