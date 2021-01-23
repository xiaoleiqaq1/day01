package com.day05.games;

public class Player {
    private int computerScore;
    private int playerScore;

    public Player() {
    }

    public Player(int computerScore, int playerScore) {
        this.computerScore = computerScore;
        this.playerScore = playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }
    //玩家的方法
    public int play(){
        return 0;
    }
}
