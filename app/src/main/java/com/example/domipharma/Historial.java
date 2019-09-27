package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Historial extends AppCompatActivity {

    Button buscar, contacto, cuenta;
    ImageButton retro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        buscar = (Button)findViewById(R.id.botonBuscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buscar = new Intent(Historial.this, Buscar.class);
                startActivity(buscar);
            }
        });

        contacto = (Button)findViewById(R.id.botonContacto);

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacto = new Intent(Historial.this, Contacto.class);
                startActivity(contacto);
            }
        });

        cuenta = (Button)findViewById(R.id.botonCuenta);

        cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cuenta = new Intent(Historial.this, cuenta.class);
                startActivity(cuenta);
            }
        });

        retro = (ImageButton)findViewById(R.id.botonRetroceder);

        retro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retro = new Intent(Historial.this, MainMenuClient.class);
                startActivity(retro);
            }
        });
    }
}
