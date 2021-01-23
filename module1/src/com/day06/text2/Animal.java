package com.day06.text2;

public class Animal {
    private String name;
    private String color;
    private int price;

    public Animal() {
    }

    public Animal(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void eat(){
        System.out.println(this.name+"吃饭,颜色："+this.color+"，价格："+this.price);
    }
}
