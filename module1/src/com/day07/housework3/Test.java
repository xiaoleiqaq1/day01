package com.day07.housework3;

public class Test {
    public static void main(String[] args) {
        //多态的具体实现：
        /*使用多态前提

        1. 继承或者实现【二选一】
        2. 方法的重写【意义体现：不重写，无意义】
        3. 父类引用指向子类对象【格式体现】
        */
        //向上转型
//        Animal animal=new Dog("小黄狗",50);
//        animal.eat();
//        ((Dog) animal).lookHome();
//        Animal animal1=new Cat("小橘猫",20);
//        animal1.eat();
//        ((Cat) animal1).catchMouse();
        //向下转型：父类的对象向下转型
//        第一种：
//        Animal animal1=new Cat("小橘猫",20);//先向上，再向下
//        Cat cat=(Cat) animal1;//向下
//        cat.catchMouse();
        Animal d=new Dog("小黄狗",50);
        d.eat();
        if (d instanceof Cat){
            Cat cat=(Cat) d;
            cat.catchMouse();
        }else if (d instanceof Dog){
            Dog dog=(Dog) d;
            dog.lookHome();
        }
        Animal a = new Cat("小橘猫",20);
        a.eat();
        //如果a是属于Cat类型的
       if (a instanceof Cat){
           Cat cat=(Cat) a;
           cat.catchMouse();
       }else if (a instanceof Dog){
           Dog dog=(Dog) a;
           dog.lookHome();
       }
    }
}
