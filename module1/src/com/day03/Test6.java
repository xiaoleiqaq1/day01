package com.day03;

public class Test6 {
    public static void main(String[] args) {
        showColor("green");
    }
    public static void showColor(String color){
        switch (color){
            case "red":
                System.out.println("红色");
                break;
            case "blue":
                System.out.println("蓝色");
                break;
            case "green":
                System.out.println("绿色");
                break;
            default:
                System.out.println("其他情况，未知");
                break;
        }
    }
//
//    public static void showColor(String color){
//        if (color=="red"){
//            System.out.println("红色");
//        }else if (color=="blue"){
//            System.out.println("蓝色");
//        }else if (color=="green"){
//            System.out.println("绿色");
//        }else{
//            System.out.println("其他情况，未知");
//        }
//    }
}
