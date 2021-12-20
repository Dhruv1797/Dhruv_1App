package com.example.dhruvapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ename;
    private EditText ePassword;
    private Button eLogin;

    private String Username = "harsh@gmail.com";
    private String Password = "qwerty01$0(";

    boolean isvaild = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename = findViewById(R.id.inputEmail);
        ePassword = findViewById(R.id.inputPassword);
        eLogin = findViewById(R.id.button);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputname = ename.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if (inputname.isEmpty() || inputPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter Correct Detals", Toast.LENGTH_SHORT).show();
                }else{

                    isvaild = validate(inputname, inputPassword);
                    if (!isvaild) {

                        counter--;

                        Toast.makeText(MainActivity.this, "incorrect credentials Entered", Toast.LENGTH_SHORT).show();
                        if (counter == 0) {
                            eLogin.setEnabled(false);
                        }
                    }else {
                            Toast.makeText(MainActivity.this, "Sucessfully Login!", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                            startActivity(intent);

                    }
                }
            }
        });
    }



private boolean validate (String name, String password){

    if (name.equals(Username) && password.equals(Password)){
        return true;

    }

    return false;
}
}