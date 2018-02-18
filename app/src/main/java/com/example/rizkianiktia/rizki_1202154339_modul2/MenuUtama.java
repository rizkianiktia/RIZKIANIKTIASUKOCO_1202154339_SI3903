package com.example.rizkianiktia.rizki_1202154339_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    private RadioGroup a;
    private RadioButton d, e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        //deklarasi variabel
        a = (RadioGroup) findViewById(R.id.pilihh);

    }
    // method ketika menekan tombol untuk pilih menu/pesan

    public void pesan(View view) {
        int selecteditem = a.getCheckedRadioButtonId();
        d = (RadioButton) findViewById(R.id.radioButton_dine);
        e = (RadioButton) findViewById(R.id.radioButton_takeaway);
        if (selecteditem == d.getId()) {
            Intent bc = new Intent(MenuUtama.this, Dinein.class);
            startActivity(bc);
            Toast.makeText(MenuUtama.this, "Dine In", Toast.LENGTH_LONG).show();
            //jeda selesai Splashscreen
            this.finish();
        } else if (selecteditem == e.getId()) {
            Intent de = new Intent(MenuUtama.this, Takeaway.class);
            startActivity(de);

            Toast.makeText(MenuUtama.this, "Take Away", Toast.LENGTH_LONG).show();
            this.finish();
        }
    }
}
