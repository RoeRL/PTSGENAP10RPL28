package com.example.loginjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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

        Button buttonlogin = findViewById(R.id.buttonLogin);//buat nyari id dari button yang kau taro di xml dan mendefinisikannya menjadi "buttonlogin"
        getSupportActionBar().hide();//buat ngumpetin menu di atas halaman

        buttonlogin.setOnClickListener(new View.OnClickListener() {//yang akan di lahkukan ketika buttonlogin(penjelasan ada di Button buttonlogin =) di pencet
            public void onClick(View v) {
                login();
            }
        });
    }


    void login(){
        EditText emailLogin = (EditText)findViewById(R.id.EmailAddress);
        EditText passwordLogin = (EditText)findViewById(R.id.TextPassword);

        String emailVer = "bimo.17168@gmail.com";
        String passwordVer = "IniPassword123";

        String emailLog = emailLogin.getText().toString();
        String passwordLog = passwordLogin.getText().toString();

        //toast = alert

        if (emailLog.equals(emailVer) && passwordLog.equals(passwordVer)) {
            Toast.makeText(this, "Anda Masuk", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, RecyclerView.class);
            startActivity(intent);


            
        }else {
            Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show();
        }

    }


}