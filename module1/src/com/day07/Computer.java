package com.day07;

import java.util.Random;

public class Computer extends Player{
    private int computer;

    public Computer(){

    }

    public Computer(int computerScore, int personScore, int computer) {
        super(computerScore, personScore);
        this.computer = computer;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    @Override
    public int run() {
        Random random=new Random();
        int computer=random.nextInt(3)+1;
        return computer;
    }
}
