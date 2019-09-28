package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ok;
    TextView username;
    TextView password;
    String user;
    String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok=findViewById(R.id.ok);
        username=findViewById(R.id.user);
        password=findViewById(R.id.pass);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user=username.getText().toString();
                pass=password.getText().toString();
                if(user.equals("admin")&&pass.equals("admin"))
                {
                    Intent intent=new Intent(getBaseContext(),menu.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "MK khong dung", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
