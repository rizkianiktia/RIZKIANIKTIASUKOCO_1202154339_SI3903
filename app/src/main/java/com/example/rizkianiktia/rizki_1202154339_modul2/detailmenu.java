package com.example.rizkianiktia.rizki_1202154339_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class detailmenu extends AppCompatActivity {
    private ArrayList<MenuModel> menus;
    private String idMenu;
    private TextView nama, harga, deskripsi;
    private ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmenu);

        nama = (TextView)findViewById(R.id.DetailNama);
        harga = (TextView)findViewById(R.id.DetailHarga);
        deskripsi = (TextView)findViewById(R.id.DetailDeskripsi);
        gambar = (ImageView) findViewById(R.id.DetailGambar);

        menus = DaftarMenu.menuList;
        Intent a = getIntent();
        idMenu = a.getStringExtra("MenuID");
        Log.d("DETAILED MENU", "id:"+idMenu);
        MenuModel menu = menus.get(Integer.parseInt(idMenu));
        nama.setText(menu.getNama());
        setTitle(menu.getNama());
       harga.setText("" + NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(menu.getHarga()) +", - /Porsi");
        deskripsi.setText(menu.getDeskripsi());
        gambar.setImageResource(menu.getGambar());
    }

}
