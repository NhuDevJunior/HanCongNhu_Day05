package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    List<Contact> contactList;
    RecyclerView recyclerView;
    ContactAdapter contactAdapter;
    Button order;
    TextView shopping;
    int soluong=0;
    tax bills=new tax();
    ArrayList<Contact> billmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView=findViewById(R.id.rvlist);
        order=findViewById(R.id.order);
        shopping=findViewById(R.id.shopping);
        contactList=new ArrayList<>();
        billmin=new ArrayList<>();
        contactList.add(new Contact("Pizza",10));
        contactList.add(new Contact("KFC",10));
        contactList.add(new Contact("Bread",10));
        contactList.add(new Contact("Hamburger",10));
        contactList.add(new Contact("coca",10));
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getBaseContext(),LinearLayoutManager.VERTICAL,false);
        contactAdapter=new ContactAdapter(contactList);

        contactAdapter.setIonClickContact(new IonClickContact() {
            @Override
            public void onClickName(Contact contact) {
                int sl=contact.getSoluong();
                if(sl==10)
                {
                    contact.setSoluong(1);
                }
                if(check(contact.getNamefood())==-1) {
                    billmin.add(contact);
                    bills.setHoadon(billmin);
                }
                else
                {
                    int vt=check(contact.getNamefood());
                    sl=sl+1;
                    billmin.get(vt).setSoluong(sl);
                    bills.setHoadon(billmin);
                }
                soluong=soluong+1;
                String text=String.valueOf(soluong);
                shopping.setText(text);

            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getBaseContext(),Bill.class);
                int s=bills.hoadon.size();
               intent.putExtra("object",bills);
               startActivity(intent);
            }
        });
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(contactAdapter);
    }

public int check(String s)
{
    for(int i=0;i<billmin.size();i++)
    {
     if(billmin.get(i).getNamefood().equals(s))
     {
         return i;
     }
    }
    return -1;
}
}
