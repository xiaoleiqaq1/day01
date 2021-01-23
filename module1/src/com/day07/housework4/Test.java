package com.day07.housework4;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("马云",45);
        SportTeacher sportTeacher=new SportTeacher("大姚",35);
        Student student=new Student("小王", 20);
        SportStudent sportStudent=new SportStudent("王中王",21);
//        goToSport(teacher);---->这两行报错，两者没有实现Sport接口不能传入
//        goToSport(student);

        goToSport(sportTeacher);
        goToSport(sportStudent);
    }
    public static void goToSport(Sport s){
// 在goToSport方法中调用传入参数的playBasketball方法
        s.playBasketball();
    }
}
