package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Bill extends AppCompatActivity {
    List<Contact>contactList;
    RecyclerView recyclerView;
    ContactAdapter contactAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        recyclerView = findViewById(R.id.rvlist2);
        Intent intent=getIntent();
        tax bills=(tax) intent.getSerializableExtra("object");
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getBaseContext(),LinearLayoutManager.VERTICAL,false);
        contactAdapter=new ContactAdapter(bills.hoadon);
        int s=bills.hoadon.size();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(contactAdapter);

    }

}
