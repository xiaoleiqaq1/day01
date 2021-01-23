package com.day05.games;

import java.util.Random;

public class Games extends Player {
    private int computerGame;

    public Games() {
    }

    public Games(int computerScore, int playerScore, int computerGame) {
        super(computerScore, playerScore);
        this.computerGame = computerGame;
    }

    public int getComputerGame() {
        return computerGame;
    }

    public void setComputerGame(int computerGame) {
        this.computerGame = computerGame;
    }
    //重写玩家的方法
    @Override
    public int play() {
//        super.play();
        Random random=new Random();
        int rand=random.nextInt(3)+1;
        return rand;
    }

}
