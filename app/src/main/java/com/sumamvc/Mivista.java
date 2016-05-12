package com.sumamvc;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Javier on 14/08/2015.
 */
public class Mivista extends LinearLayout{

    public EditText pantalla;


    public Mivista(Activity actividad) {
        super(actividad,null);

        //se levanta el layout
        LayoutInflater inflador=(LayoutInflater)actividad.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // se establece la vista del resultado

        inflador.inflate(R.layout.pantalla,this);

        pantalla=(EditText)findViewById(R.id.editString);



    }

    public void setView(String s){

        // se establece la vista del resultado por pantalla desde aca.

        pantalla.setText(s);


    }
}
