package com.day08.homework1;

public class Student {
    private int number;
    private String name;
    private int score;

    public Student() {
    }

    public Student(int number, String name, int score) {
        this.number = number;
        this.name = name;
        this.score = score;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score<0){
            throw new NoScoreException("分数不能为负数，你目前分数为:"+score+"分");
        }else if (score>100){
            throw new NoScoreException("分数不能大于100，你目前分数为:"+score+"分");
        }else {
            this.score=score;
        }
    }
}
