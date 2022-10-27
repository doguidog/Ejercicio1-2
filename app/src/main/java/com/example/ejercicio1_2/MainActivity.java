package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre,txtapellidos,txtedad,txtcorreo;
    Button btnenviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        casteo();

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(),MainActivity2.class);
                intencion.putExtra("nombre",txtnombre.getText().toString());
                intencion.putExtra("apellidos",txtapellidos.getText().toString());
                intencion.putExtra("edad",txtedad.getText().toString());
                intencion.putExtra("correo",txtcorreo.getText().toString());

                startActivity(intencion);
            }
        });



    }

    private void casteo(){
        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtapellidos = (EditText) findViewById(R.id.txtapellidos);
        txtedad = (EditText) findViewById(R.id.txtedad);
        txtcorreo = (EditText) findViewById(R.id.txtcorreo);
        btnenviar = (Button) findViewById(R.id.btnenviar);
    }

}