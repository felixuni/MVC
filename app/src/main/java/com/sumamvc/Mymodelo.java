package com.sumamvc;

/**
 * Created by Javier on 14/08/2015.
 */
public class Mymodelo {

    private double  acumulador,operacion;

    private char op;

    public Mymodelo(){acumulador=0.0;}

    //vamos a setear el modelo

    public void setModel(char c){

        switch (c){

            case 'C':
                operacion=0.0;
                acumulador=0.0;
                break;
            case '+':  // se establece el operador +
                //op=c;
                operacion=acumulador;
                acumulador=0.0;
                break;
            case '=':
                acumulador=operacion+acumulador;
                break;
            default:
                acumulador = acumulador * 10.0 + (c-'0'); //se  mueve el valor para ser observado
                break;
        }


    }

    public String getModel() { return acumulador+""; }
}



