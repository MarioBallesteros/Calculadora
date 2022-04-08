package com.example.mariosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0, botonmas, botonigual, botonC,botonreturn;
    private TextView textView;
    //private Spinner spinner;
    private String aux = "";
    private String aux2 = "";

    private boolean pass=false,sum=false,rest=false,div=false,mult=false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);


        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);
        boton5 = findViewById(R.id.boton5);
        boton6 = findViewById(R.id.boton6);
        boton7 = findViewById(R.id.boton7);
        boton8 = findViewById(R.id.boton8);
        boton9 = findViewById(R.id.boton9);
        boton0 = findViewById(R.id.boton0);
        botonmas = findViewById(R.id.botonmas);
        botonigual = findViewById(R.id.botonigual);
        botonC = findViewById(R.id.botonC);
        botonreturn = findViewById(R.id.botonreturn);
        textView = findViewById(R.id.textView5);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
        boton0.setOnClickListener(this);
        botonmas.setOnClickListener(this);
        botonigual.setOnClickListener(this);
        botonC.setOnClickListener(this);
        botonreturn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view instanceof Button) {
            Button b = (Button) view;
            if (b.getId() == boton1.getId()) {
                if (!pass) {
                    aux += "1";
                } else {
                    textView.setText(aux2);
                    aux2+="1";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton2.getId()) {
                if (!pass) {
                    aux += "2";
                } else {
                    textView.setText(aux2);
                    aux2+="2";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton3.getId()) {
                if (!pass) {
                    aux += "3";
                } else {
                    textView.setText(aux2);
                    aux2+="3";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton4.getId()) {
                if (!pass) {
                    aux += "4";
                } else {
                    textView.setText(aux2);
                    aux2+="4";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton5.getId()) {
                if (!pass) {
                    aux += "5";
                } else {
                    textView.setText(aux2);
                    aux2+="5";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton6.getId()) {
                if (!pass) {
                    aux += "6";
                } else {
                    textView.setText(aux2);
                    aux2+="6";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton7.getId()) {
                if (!pass) {
                    aux += "7";
                } else {
                    textView.setText(aux2);
                    aux2+="7";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton8.getId()) {
                if (!pass) {
                    aux += "8";
                } else {
                    textView.setText(aux2);
                    aux2+="8";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton9.getId()) {
                if (!pass) {
                    aux += "9";
                } else {
                    textView.setText(aux2);
                    aux2+="9";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == boton0.getId()) {
                if (!pass) {
                    aux += "0";
                } else {
                    textView.setText(aux2);
                    aux2+="0";
                    aux=operacionIgual(aux,aux2);
                    aux2="";
                    pass=false;
                }
            }
            if (b.getId() == botonmas.getId()) {
                if (!pass) {
                    // aux+="1";
                    textView.setText("0");
                    sum = true;
                    pass = true;
                } else if (pass) {
                    textView.setText("0");
//                    aux = operacionIgual(aux,aux2);
//                    aux2 = "";
                    pass=false;
                }
            }
            if (b.getId() == botonigual.getId()) {
                aux = operacionIgual(aux,aux2);
            }
            if (b.getId() == botonC.getId()) {
                aux = "";
            }
            if (b.getId() == botonreturn.getId()) {
                if (!pass)
                    aux = operacionReturn(aux);
                else
                    aux2 = operacionReturn(aux2);
            }
            if (!pass) {
                textView.setText(aux);
            } else{
                textView.setText(aux2);
                aux2="";
            }
        }
        System.out.println("prim"+aux);
        System.out.println("seg"+aux2);
    }
    private String operacionReturn(String aux) {
        String newaux="";
        for (int i = 0; i < aux.length()-1; i++) {
            newaux+=aux.charAt(i);
        }
        return newaux;
    }

    private String operacionIgual(String aux,String aux2) {
        char suma = '+';
        int primPart;
        int segPart;
        String presuma = "";
        String postsuma = "";
        System.out.println(aux);
        System.out.println(aux2);
        System.out.println("operacion"+ operacionReturn(aux));
        //presuma =operacionReturn(aux);
        presuma = aux;
        postsuma+=aux2;
        primPart= Integer.parseInt(presuma);
        segPart = Integer.parseInt(postsuma);
        System.out.println(primPart+" prim");
        System.out.println(segPart+" seg");
        System.out.println(primPart+segPart+"");
        return primPart+segPart+"";
    }
}