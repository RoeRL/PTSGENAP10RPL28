package com.example.loginjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonlogin = findViewById(R.id.buttonLogin);
        getSupportActionBar().hide();

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                login();
            }
        });
    }


    void login(){
        EditText emailLogin = (EditText)findViewById(R.id.EmailAddress);
        EditText passwordLogin = (EditText)findViewById(R.id.TextPassword);

        String emailVer = "bimo.17168@gmail.com";
        String passwordVer = "yesplz123";

        String emailLog = emailLogin.getText().toString();
        String passwordLog = passwordLogin.getText().toString();

        //toast = alert

        if (emailLog.equals(emailVer) && passwordLog.equals(passwordVer)) {
            Toast.makeText(this, "Anda Masuk", Toast.LENGTH_SHORT).show();

            
        }else {
            Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show();
        }

    }
}