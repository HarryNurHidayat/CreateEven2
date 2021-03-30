package com.example.createeven2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //Deklarasikan variabel dengan jenis data context
    Context mContext;

    //Deklarasikan variabel dengan jenis data layout inflater
    LayoutInflater inflater;

    //Deklarasikan variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arrayList;

    //Membuat Konstruktor Listviewadapter
    public ListViewAdapter(Context context){
        //memberi nilai mContext dengan context
        mContext = context;

        //mengatur layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //Memberikan nilai arrayList dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();

        //Menambahkan semua elemen ke arraylist
        this.arrayList.addAll(Home_Activity.classNamaArrayList);

    }

    //membuat class untuk mendeklarasikan tempat untuk meletakkan isi kedalam listview
    public class ViewHolder{
        TextView name;
    }

    //fungsi getcount () mengembalikan jumlah item yang akan ditampilka dalam list
    @Override
    public int getCount() {
        //memgembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }

    //fungsi ini digunakan untuk mendapatkan data item yang terkait dalam posisi
    //tertentu dalam kumpulan data untuk mendapatkan data yang sesuai dari lokasi
    //tertentu dalam pengumpulan data item
    @Override
    public Object getItem(int i) {
        //mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }

    //fungsi mengembalikan "nilai" dari posisi item ke adaptor.
    @Override
    public long getItemId(int i) {
        return i;
    }

    //fungsi ini secara otomatis dipanggil ketika tampilan item list siap untuk
    //ditampilkan atau akan ditampilkan
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //deklarasikan variabel dengan jenis data ViewHolder
        final ViewHolder holder;

        //membuat kondisi apakah view null atau tidak
        if (view == null){

            //membuat objek view holder
            holder = new ViewHolder();

            //mengatur layout untuk menampilka item
            view = inflater.inflate(R.layout.item_listview, null);

            //set id untuk interview
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            //menyimpan data dalam tampilan tanpa menggunakan struktur data lain.
            view.setTag(holder);

        }else{
            //mengatur holder untuk mengembaikan nilai dari view tag.
            holder = (ViewHolder) view.getTag();
        }
        //set item ke Textviews
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getNama());

        //mengambil nilai ke variabel view
        return view;
    }
}
