package com.example.login;

import java.io.Serializable;

public class Contact implements Serializable {
    String namefood;
    int soluong;

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public Contact(String namefood, int soluong) {
        this.namefood = namefood;
        this.soluong = soluong;
    }

    public String getNamefood() {
        return namefood;
    }

    public void setNamefood(String namefood) {
        this.namefood = namefood;
    }
}
