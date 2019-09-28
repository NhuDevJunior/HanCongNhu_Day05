package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    List<Contact> contactList;
    RecyclerView recyclerView;
    ContactAdapter contactAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        recyclerView=findViewById(R.id.rvlist);
        contactList=new ArrayList<>();
        contactList.add(new Contact("Pizza"));
        contactList.add(new Contact("KFC"));
        contactList.add(new Contact("Bread"));
        contactList.add(new Contact("Hamburger"));
        contactList.add(new Contact("coca"));
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getBaseContext(),LinearLayoutManager.VERTICAL,false);
        contactAdapter=new ContactAdapter(contactList);
        contactAdapter.setIonClickContact(new IonClickContact() {
            @Override
            public void onClickName(Contact contact) {
                Intent intent=new Intent(getBaseContext(),Bill.class);
                startActivity(intent);
            }
        });
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(contactAdapter);
    }

}
