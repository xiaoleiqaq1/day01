package com.day07;

public class Player {
    private int computerScore;
    private int personScore;

    public Player() {
    }

    public Player(int computerScore, int personScore) {
        this.computerScore = computerScore;
        this.personScore = personScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public int getPersonScore() {
        return personScore;
    }

    public void setPersonScore(int personScore) {
        this.personScore = personScore;
    }
    public int run(){
        return 0;
    }
}
