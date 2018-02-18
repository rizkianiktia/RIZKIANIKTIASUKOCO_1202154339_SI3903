package com.example.rizkianiktia.rizki_1202154339_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Dinein extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String mSpinnerlabel = "";
    private Spinner a;
    private EditText name;
    private Button pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        name = (EditText) findViewById(R.id.editText_name); //deklarasi
        a = (Spinner) findViewById(R.id.meja);
        pesanan = (Button) findViewById(R.id.button_pesanan);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.meja,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (a != null) {
            a.setAdapter(adapter);
        }


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) { //ketika memilih iem spinner
        mSpinnerlabel = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void pesanan(View view) {

        String spinner = a.getSelectedItem().toString();
        String b =  name.getText().toString();

       if(b.isEmpty() || spinner.isEmpty()) {
           Toast.makeText(Dinein.this, "Isi data terlebih dahulu", Toast.LENGTH_LONG).show();
       }else
       {
           Intent intent = new Intent(Dinein.this,DaftarMenu.class);
           startActivity(intent);
           Toast.makeText(Dinein.this, "Pilih menu untuk " + spinner,Toast.LENGTH_LONG).show();

            }


        }
    }

