package com.example.ejerciciolistviewpersonalizado2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Agenda> contactos;
    ListView listView;
    Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);

        // creo el arraylist
        contactos= new ArrayList<Agenda>();
        //  meto datos en el arraylist
        contactos.add(new Agenda("jesus","616616616","Miguel de benavides",R.drawable.ic_contact_phone_black24dp));
        contactos.add(new Agenda("Marysol","620620620","la misma case",R.drawable.ic_contact_phone_black_24dp));
        contactos.add(new Agenda("Rodrigo","123456789","la calle ",R.drawable.ic_contact_phone_black_24dp));

        contactos.add(new Agenda("Pedro","7894563333","la palencia",R.drawable.ic_contact_phone_black_24dp));

        contactos.add(new Agenda("Luis","456132000","el perro 13",R.drawable.ic_contact_phone_black_24dp));
        contactos.add(new Agenda("Carlitos","456130004","la Autilla",R.drawable.ic_contact_phone_black_24dp));
        contactos.add(new Agenda("Matriuska","11110000","calle simon 6",R.drawable.ic_contact_phone_black_24dp));



        // el segundo parametro es el layout creado para el adaptador
        // en este caso es el lista_view
        adaptador= new Adaptador(this,R.layout.lista_view,contactos);
        listView.setAdapter(adaptador);

    }
}
