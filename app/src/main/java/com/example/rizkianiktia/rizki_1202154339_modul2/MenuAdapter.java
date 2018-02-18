package com.example.rizkianiktia.rizki_1202154339_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {


    class MenuViewHolder extends RecyclerView.ViewHolder{
        private TextView lbNama, lbHarga, lbID;
        private ImageView lbGambar;

        public MenuViewHolder(View itemView) {
            super(itemView);
            lbID = (TextView) itemView.findViewById(R.id.listId);
            lbNama = (TextView) itemView.findViewById(R.id.listNama);
            lbHarga = (TextView) itemView.findViewById(R.id.listHarga);
            lbGambar = (ImageView) itemView.findViewById(R.id.listGambar);


        }
    }

    private ArrayList<MenuModel> dataList;

    public MenuAdapter(Context mCtxt, ArrayList<MenuModel> list) {
        this.dataList = list;
        Log.d("Jumlah Menu", "Size: " + getItemCount());
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemmenulist, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MenuViewHolder holder, int position) {
        holder.lbID.setText("" + position);
        holder.lbNama.setText(dataList.get(position).getNama());
        holder.lbHarga.setText("" + NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(dataList.get(position).getHarga()));
        holder.lbGambar.setImageResource(dataList.get(position).getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idx = holder.lbID.getText().toString();
                Log.d("ItemMenuCLICKED","ID:"+idx);
                Toast.makeText(view.getContext(), "Memilih Menu '"+dataList.get(Integer.parseInt(idx)).getNama()+"'", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(view.getContext().getApplicationContext(), detailmenu.class);
                i.putExtra("MenuID",""+idx);
                view.getContext().startActivity(i);

            }


        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    }


