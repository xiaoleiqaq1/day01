package com.day06.testAbstract;

public class TestAnimal {
    public static void main(String[] args) {
        TestGress testGress=new TestGress("山羊",20);
        testGress.eat();
        testGress.run();
        System.out.println("----------");

        TestMeat testMeat=new TestMeat("老虎",30);
        testMeat.eat();
        testMeat.run();
    }
}
