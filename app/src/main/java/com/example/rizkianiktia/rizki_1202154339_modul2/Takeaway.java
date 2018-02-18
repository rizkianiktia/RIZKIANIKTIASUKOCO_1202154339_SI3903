package com.example.rizkianiktia.rizki_1202154339_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Takeaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void proses(View view) {
        {
            Intent ab = new Intent(Takeaway.this, DaftarMenu.class); // untuk membuka activity daftar menu
            startActivity(ab);
        }
    }
}
