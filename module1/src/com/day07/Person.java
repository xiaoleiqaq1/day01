package com.day07;

import java.util.Scanner;

public class Person extends Player{
    private int person;

    public Person() {
    }

    public Person(int computerScore, int personScore, int person) {
        super(computerScore, personScore);
        this.person = person;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    @Override
    public int run() {
        System.out.println("请输入人出的石头-1,剪刀-2,布-3：");
        Scanner scanner=new Scanner(System.in);
        int person=scanner.nextInt();
        return person;
    }
}
