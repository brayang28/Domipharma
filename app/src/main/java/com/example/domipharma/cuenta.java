package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;


public class cuenta extends AppCompatActivity {

    Button buscar, contacto, historial, cerrar;
    ImageButton retro;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);

        buscar = (Button)findViewById(R.id.botonBuscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buscar = new Intent(cuenta.this, Buscar.class);
                startActivity(buscar);
            }
        });

        contacto = (Button)findViewById(R.id.botonContacto);

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacto = new Intent(cuenta.this, Contacto.class);
                startActivity(contacto);
            }
        });

        historial = (Button)findViewById(R.id.botonHistorial);

        historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historial = new Intent(cuenta.this, Historial.class);
                startActivity(historial);
            }
        });

        retro = (ImageButton)findViewById(R.id.botonRetroceder);

        retro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retro = new Intent(cuenta.this, MainMenuClient.class);
                startActivity(retro);
            }
        });

        cerrar = (Button)findViewById(R.id.botonCerrarSesion);

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent cerrar = new Intent(cuenta.this, MainActivity.class);
                startActivity(cerrar);
                finish();
            }
        });


    }
}
