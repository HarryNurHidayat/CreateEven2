package com.example.createeven2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    //mendeklarasikan variabel dengan tipe data TextView
    TextView txtemail, txtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil2);

        //Menghubungkan variabel txtemail dengan componen TextView pada Layout
        txtemail = findViewById(R.id.tvEmail);

        //menghubungkan variabel txtemail dengan componen TextView pada layout
        txtpassword = findViewById(R.id.tvPassword);

        //mendeklarasikan variabel string bundle yang akan digunakan untuk mengambil
        //pesan yang dikirimkan melalui method intent
        Bundle Bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = Bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = Bundle.getString("b");

        //menampilkan value dari variabel email kedalam txtemail
        txtemail.setText(email);

        //menampilkan value dari variabel pass kedalam txtpassword
        txtpassword.setText(pass);
    }
}