package com.sumamvc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;


public class PrincipalSuma extends Activity {
    public static String CLASS_TAG = PrincipalSuma.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_principal_suma);

            //creacion de el modelo MVC

            Mymodelo mimodelo = new Mymodelo();

            Mivista vista = new Mivista(this);

            Micontrlador controlador = new Micontrlador(this, mimodelo, vista);

            ViewGroup contenedor = (ViewGroup) findViewById(R.id.myLayout);

            //al contendor le pasamos la vista
            contenedor.addView(vista);
            // al contenedor le pasamos el controlador
            contenedor.addView(controlador);


        } catch (Exception e) {
            Log.e(CLASS_TAG, "ERROR EN ALGUNOS DE LOS ELEMENTOS MVC" + e.getMessage().toString());
            e.printStackTrace();

        }


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal_suma, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
