package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView11, textView22, textView33, textView44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        casteo();

        Bundle resultado = getIntent().getExtras();
        textView11.setText(resultado.getString("nombre"));
        textView22.setText(resultado.getString("apellidos"));
        textView33.setText(resultado.getString("edad"));
        textView44.setText(resultado.getString("correo"));

    }

    private  void casteo(){
        textView11 = (TextView) findViewById(R.id.textView11);
        textView22 = (TextView) findViewById(R.id.textView22);
        textView33 = (TextView) findViewById(R.id.textView33);
        textView44 = (TextView) findViewById(R.id.textView44);
    }
}