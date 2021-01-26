package com.day17.demo;

public class Bank {
        private int money=0;
        public void deposits(){
            money+=100;
        }
        public String toString() {
            return "\t余额："+money+"元";
        }

        public int getMoney() {
            return money;
        }
        public void setMoney(int money) {
            this.money = money;
        }
}
