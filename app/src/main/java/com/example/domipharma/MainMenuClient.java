package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuClient extends AppCompatActivity {

    Button buscar, contacto, historial, cuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_client);

        buscar = (Button)findViewById(R.id.botonBuscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buscar = new Intent(MainMenuClient.this, Buscar.class);
                startActivity(buscar);
            }
        });

        contacto = (Button)findViewById(R.id.botonContacto);

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacto = new Intent(MainMenuClient.this, Contacto.class);
                startActivity(contacto);
            }
        });

        historial = (Button)findViewById(R.id.botonHistorial);

        historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historial = new Intent(MainMenuClient.this, Historial.class);
                startActivity(historial);
            }
        });

        cuenta = (Button)findViewById(R.id.botonCuenta);

        cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cuenta = new Intent(MainMenuClient.this, cuenta.class);
                startActivity(cuenta);
            }
        });
    }
}
