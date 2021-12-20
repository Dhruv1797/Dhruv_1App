package com.example.dhruvapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

public class MainActivity2 extends AppCompatActivity {
      Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        logout=findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentL=new Intent(MainActivity2.this,MainActivity.class);
                        startActivity(intentL);
                finish();
                Toast.makeText(MainActivity2.this,"Sucessfully Logout",Toast.LENGTH_SHORT).show();
            }
        });


    }
}