package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Carrito extends AppCompatActivity {

    Button car, comp;
    ImageButton retro, buscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

      /*  car = (Button)findViewById(R.id.botonVaciar);

        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent car = new Intent(Carrito.this, )
            }
        });*/

        comp = (Button)findViewById(R.id.botonComprar);

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comp = new Intent(Carrito.this, realizarDomicilio.class);
                startActivity(comp);
            }
        });

        retro = (ImageButton)findViewById(R.id.botonRetroceder);

        retro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retro = new Intent(Carrito.this, MainMenuAdmin.class);
                startActivity(retro);
            }
        });

        buscar = (ImageButton)findViewById(R.id.botonBuscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buscar = new Intent(Carrito.this, Buscar.class);
                startActivity(buscar);
            }
        });
    }
}
