package com.example.rizkianiktia.rizki_1202154339_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuAdapter menuAdapter;

    public static ArrayList<MenuModel> menuList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new MenuAdapter(this, menuList);
        recyclerView.setAdapter(menuAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public ArrayList<MenuModel> isiMenu(){ // membuat daftar menu menggunakan array
        ArrayList<MenuModel> data = new ArrayList<>();
        data.add(new MenuModel("Mie goreng", 20000, R.drawable.mie_goreng, "Mie goreng + Nasi"));
        data.add(new MenuModel("Nasi goreng", 30000, R.drawable.nasi_goreng, "Nasi goreng + Nasi. nasi goreng dengan bumbu khas jawa"));
        data.add(new MenuModel("Nasi pecel", 25000, R.drawable.nasi_pecel, "Nasi pecel + Nasi. pecel dengan bumbu kacang khas madiun"));
        data.add(new MenuModel("Nasi rendang", 35000, R.drawable.nasi_rendang, "Nasi rendang + Nasi. rendang dengan daging berkualitas dan bumbu yang khas asal padang"));
        data.add(new MenuModel("Ayam Bakar", 35000, R.drawable.ayam_bakar, "Ayam bakar + Nasi. Ayam dengan masakan bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah"));
        data.add(new MenuModel("Sate Padang", 40000, R.drawable.sate_padang, "Sate Padang + Nasi. sate khas daerah padang dengan olahan rempah-rempah asal padang"));
        return data;


    }
}
