package com.day04.homework;

public class Circle {
    private int r;
    private final double PI=3.14;
    public Circle(){

    }
    public Circle(int r){
        this.r=r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void showArea(){
        System.out.println("圆的面积"+r*r*PI);
    }
    public void showPerimeter(){
        System.out.println("圆的周长"+2*PI*r);
    }
}
