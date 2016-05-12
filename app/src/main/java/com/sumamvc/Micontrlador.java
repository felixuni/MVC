package com.sumamvc;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Javier on 14/08/2015.
 */
public class Micontrlador extends LinearLayout{
    public Micontrlador(Activity actividad, final Mymodelo mimodelo, final Mivista mivista) {
        super(actividad, null);

    //se levanta el layout
        LayoutInflater inflador=(LayoutInflater)actividad.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // se establece la vista del teclado

        View vista=inflador.inflate(R.layout.teclado,this);

        // se establece el botn 0 para borrar pantalla

        Button cero=(Button)vista.findViewById(R.id.button0);

        cero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mimodelo.setModel('0');
                mivista.setView(mimodelo.getModel());

            }
        });

        Button uno=(Button)vista.findViewById(R.id.button1);

        uno.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mimodelo.setModel('1');
                mivista.setView(mimodelo.getModel());

            }
        });

        Button dos=(Button)vista.findViewById(R.id.button2);

        dos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mimodelo.setModel('2');
                mivista.setView(mimodelo.getModel());

            }
        });
        Button c=(Button)vista.findViewById(R.id.buttonC);

        c.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mimodelo.setModel('C');
                mivista.setView(mimodelo.getModel());

            }
        });
        Button plus=(Button)vista.findViewById(R.id.buttonPlus);

        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mimodelo.setModel('+');
                mivista.setView(mimodelo.getModel());

            }
        });
        Button igual=(Button)vista.findViewById(R.id.buttonEqual);

        igual.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mimodelo.setModel('=');
                mivista.setView(mimodelo.getModel());

            }
        });


    }


}
