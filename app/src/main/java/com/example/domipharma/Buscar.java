package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Buscar extends AppCompatActivity {

    Button contacto, historial, cuenta;
    ImageButton retro, car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        contacto = (Button)findViewById(R.id.botonContacto);

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacto = new Intent(Buscar.this, Contacto.class);
                startActivity(contacto);
            }
        });

        historial = (Button)findViewById(R.id.botonHistorial);

        historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historial = new Intent(Buscar.this, Historial.class);
                startActivity(historial);
            }
        });

        cuenta = (Button)findViewById(R.id.botonCuenta);

        cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cuenta = new Intent(Buscar.this, cuenta.class);
                startActivity(cuenta);
            }
        });

        retro = (ImageButton)findViewById(R.id.botonRetroceder);

        retro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retro = new Intent(Buscar.this, MainMenuClient.class);
                startActivity(retro);
            }
        });

        car = (ImageButton)findViewById(R.id.botonVerCarrito);

        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent car = new Intent(Buscar.this, Carrito.class);
                startActivity(car);
            }
        });
    }
}
