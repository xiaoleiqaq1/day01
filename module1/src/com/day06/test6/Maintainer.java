package com.day06.test6;

public class Maintainer extends AmdimStaff{
    public Maintainer() {
    }

    public Maintainer(int number, String name) {
        super(number, name);
    }

    @Override
    public void work() {
        System.out.println("工号为："+super.getNumber()+"的维护人员 "+super.getName()+" 在解决不能共享屏幕问题");
    }
}
