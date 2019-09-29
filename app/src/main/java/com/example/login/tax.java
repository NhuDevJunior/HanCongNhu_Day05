package com.example.login;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class tax implements Serializable {
    public ArrayList<Contact> hoadon=new ArrayList<>();

    public tax(ArrayList<Contact> hoadon) {
        this.hoadon = hoadon;
    }
    public tax(){

        super();
    }

    public ArrayList<Contact> getHoadon() {
        return hoadon;
    }

    public void setHoadon(ArrayList<Contact> hoadon) {
        this.hoadon = hoadon;
    }
}
