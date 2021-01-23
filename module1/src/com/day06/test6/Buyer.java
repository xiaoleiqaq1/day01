package com.day06.test6;

public class Buyer extends AmdimStaff{
    public Buyer() {
    }

    public Buyer(int number, String name) {
        super(number, name);
    }

    @Override
    public void work() {
        System.out.println("工号为："+super.getNumber()+"的采购人员 "+super.getName()+" 在采购音响设备");
    }
}
