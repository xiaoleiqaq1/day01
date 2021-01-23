package com.day04.homework;

public class Test4 {
    public static void main(String[] args) {
        Book book=new Book(1,"红楼梦",78447,108.99,1990,12,4);
        Book book1=new Book(2,"西游记",74878,109.99,1991,11,3);
        Book book2=new Book(3,"三国演义",87454,1017.99,1992,10,2);
        if(book.getPrice()>book1.getPrice()){
            if (book.getPrice()>book2.getPrice()){
                System.out.println("最贵的书是：图书编号："+book.getNumber()+",书名:"+book.getName()
                        +"，ISBN编码:"+book.getIsbn()+"，价格:"+book.getPrice()+",出版日期:"+book.getYear()
                        +"年"+book.getMonth()+"月"+book.getDay()+"日" );
            }
        }else {
            if (book1.getPrice()>book2.getPrice()){
                System.out.println("最贵的书是：图书编号："+book1.getNumber()+",书名:"+book1.getName()
                        +"，ISBN编码:"+book1.getIsbn()+"，价格:"+book1.getPrice()+",出版日期:"+book1.getYear()
                        +"年"+book1.getMonth()+"月"+book1.getDay()+"日" );
            }else {
                System.out.println("最贵的书是：图书编号："+book2.getNumber()+",书名:"+book2.getName()
                        +"，ISBN编码:"+book2.getIsbn()+"，价格:"+book2.getPrice()+",出版日期:"+book2.getYear()
                        +"年"+book2.getMonth()+"月"+book2.getDay()+"日" );
            }
        }

    }
}
