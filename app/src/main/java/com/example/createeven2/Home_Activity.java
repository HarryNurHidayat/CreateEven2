package com.example.createeven2;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.RadioAccessSpecifier;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collection;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    //Deklarasi variabel dengan jenis data listview
    private ListView list;

    //Memanggil class ListviewAdapter dan diinisiasi menjadi variabel adapter
    private ListViewAdapter adapter;

    //deklarasi array untuk menympan nama
    String[] listNama;

    //memanggil class CmassNama
    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    //membuat objek bundle
    Bundle bundle = new Bundle();

    //membuat objek intent
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        //menyimpan nama didalam array listnama
        listNama = new String[]{"Inayah", "Ilham", "Eris", "Harry", "Fikri", "Maul", "Intan", "Vina",
                "Gita", "Vian", "Luthfi", "Kope",};

        list = findViewById(R.id.listKontak);

        //membuat objek dari class ClassNama menjadi arraylist
        classNamaArrayList = new ArrayList<>();

        //membaca seluruh data pada array listnama
        for (int i = 0; i < listNama.length; i++)
        {
            //membuat objek class nama da
            ClassNama classNama = new ClassNama(listNama[i]);
            //binds string ke array
            classNamaArrayList.add(classNama);
        }
        // membuat objek dari listviewadapter
        adapter = new ListViewAdapter(this);
        //binds adapter ke listview
        list.setAdapter(adapter);

        //membuat event dari list onclick
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //deklarasi variabel nama yang berisi item yang diklik
                String nama = classNamaArrayList.get(position).getNama();

                //memasukkan value dari variabel nama dengan kunci "a"
                //dan dimasukkan kedalam bundle
                bundle.putString("a", nama.trim());

                //membuat objek popup menu
                PopupMenu pm = new PopupMenu(getApplicationContext(),view);

                //membuat event untuk popup menu ketiika dipilih
                pm.setOnMenuItemClickListener(Home_Activity.this);

                //menampilkan popup menu dari layout menu
                pm.inflate(R.menu.popup_menu);

                //menampilkan popup menu
                pm.show();
            }
        });
    }

    //event yang terjadi ketika menu dipilih
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(),ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(),"Ini untuk edit kontak", Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}
