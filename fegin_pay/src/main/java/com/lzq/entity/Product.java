package com.lzq.entity;

import java.util.Date;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-12 22:39
 */
public class Product {
    private Long id;
    private String name;
    private Date date;

    public Product(){

    }

    public Product(Long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
