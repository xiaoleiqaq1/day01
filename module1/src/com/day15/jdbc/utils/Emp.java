package com.day15.jdbc.utils;

import java.math.BigDecimal;
import java.sql.Date;

public class Emp {
    private Integer id;
    private String name;
    //BigDecimal表示double---浮点型
    private BigDecimal menoy;
    private Date date;

    public Emp() {
    }

    public Emp(Integer id) {
        this.id = id;
    }

    public Emp(String name, BigDecimal menoy) {
        this.name = name;
        this.menoy = menoy;
    }

    public Emp(Integer id, String name, BigDecimal menoy) {
        this.id = id;
        this.name = name;
        this.menoy = menoy;
    }

    public Emp(Integer id, String name, BigDecimal menoy, Date date) {
        this.id = id;
        this.name = name;
        this.menoy = menoy;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMenoy() {
        return menoy;
    }

    public void setMenoy(BigDecimal menoy) {
        this.menoy = menoy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menoy=" + menoy +
                ", date=" + date +
                '}';
    }
}
