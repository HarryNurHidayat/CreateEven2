package com.example.createeven2;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    //deklarasi variabel dengan jenis data textview
    TextView tvnama, tvnomor;

    //membuat variabel dengan jenis data bundle dan
    //assign value dari variabel tersebut dengan
    //getIntent().getExtras()
    Bundle bundle = getIntent().getExtras();

    //membuat variabel nama dan assign value dari pesan
    //yang dikirimkan dari activity sebelumnya
    String nama = bundle.getString("a");

    //membuat fungsi untuk mengatur textview nama dan nomor telepon
    //berdasarkan pesan yang dikirimkan dari activity sebelumnya

    public String getNama() {
        switch(nama)
        {
            case"Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;
            case"Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08133224455");
                break;
            case"Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08125533344");
                break;
            case"Harry":
                tvnama.setText("Harry N");
                tvnomor.setText("08138899346");
                break;
            case"Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08122453344");
                break;
            case"Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("08126633344");
                break;
            case"Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08122555344");
                break;
            case"Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08133224455");
                break;
            case"Gita":
                tvnama.setText("Gita s");
                tvnomor.setText("08133224455");
                break;
            case"Lutfi":
                tvnama.setText("lutfi M");
                tvnomor.setText("08133224455");
                break;
            case"Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("08133224455");
                break;

        }
        return nama;
    }
}
