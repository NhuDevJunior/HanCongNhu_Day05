package com.example.login;

import java.io.Serializable;

public class sanpham implements Serializable {
    String name;
    int soluong=0;

    public sanpham(String name, int soluong) {
        this.name = name;
        this.soluong = soluong;
    }
    public sanpham(){
        super();
    }
    public String getName() {
        return name;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
