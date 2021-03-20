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
            String email = "admin@mail.com";
            String pass = "123";

            if (Email.isEmpty() || Password.isEmpty())
            {
                Toast t = Toast.makeText(getApplicationContext(), "Email dan Password wajib diisi !!!",Toast.LENGTH_LONG);
                t.show();
            }else {
                if(Email.equals("email")&& Password.equals("pass")){
                    //jika berhasil
                    Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_LONG).show();
                    Bundle b = new Bundle();
                    b.putString("a", Email.trim());
                    b.putString("b", Password.trim());
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }else{
                    //jika gagal
                    Toast t = Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}