package com.example.ejerciciolistviewpersonalizado2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Adaptador extends ArrayAdapter {

    ArrayList<Agenda> contactos;
    LayoutInflater layoutInflater;
    Context context;
    TextView tv1, tv2, tv3;
    ImageView img1;

    public Adaptador(@NonNull Context context, int resource, ArrayList<Agenda> contactos) {
        super(context, resource);
        this.contactos = contactos;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }




    @Override
    public int getCount() {
        return contactos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = layoutInflater.inflate(R.layout.lista_view, null);
        tv1 = (TextView) vista.findViewById(R.id.tvNombre);
        tv2 = (TextView) vista.findViewById(R.id.tvTelefono);
        tv3 = (TextView) vista.findViewById(R.id.tvDireccion);
        img1 = (ImageView) vista.findViewById(R.id.imageView);

        tv1.setText(contactos.get(position).getNombre());
        tv2.setText(contactos.get(position).getTelefono());
        tv3.setText(contactos.get(position).getDireccion());
        img1.setImageResource(contactos.get(position).getFoto());


        return vista;
    }
}
