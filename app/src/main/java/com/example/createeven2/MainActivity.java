package com.example.createeven2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btSingin;
    EditText edEmail, edPassword;
    String Email, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edEmail=findViewById(R.id.edEmail);
        edPassword=findViewById(R.id.edPassword);
        btSingin=findViewById(R.id.btSingin);

        btSingin.setOnClickListener((v) -> {
            Email = edEmail.getText().toString();
            Password = edPassword.getText().toString();

            if(Email.equals("")&& Password.equals("")){
                //jika berhasil

                Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_SHORT).show();
                finish();
            }else{
                //jika gagal
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Email atau Password Salah !!!")
                        .setNegativeButton("Retry",null).create().show();
            }


        });
    }
}