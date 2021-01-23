package com.day03;

public class Test2 {
    public static void main(String[] args) {

        String [] a1={"D","C","B","A","D"};//4
        String [] a2={"A","D","B","C","D"};//10
        String [] a3={"A","D","B","C","A"};//8
        String [] a4={"A","B","C","C","D"};//6
        graded("小红",a2);
    }
    public static void graded(String name,String[] arr1){
        String [] a0={"A","D","B","C","D"};//
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==a0[i]) {
                count++;
            }
        }
        System.out.println(name+"的分数是："+count * 2);

    }
}
