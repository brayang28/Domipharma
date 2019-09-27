package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainMenuAdmin extends AppCompatActivity {

    Button addProduct, informVent, cerrarSesion;
    ImageButton retro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_admin);

        retro = (ImageButton)findViewById(R.id.botonRetroceder);

        retro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retro = new Intent(MainMenuAdmin.this, ElegirVista.class);
                startActivity(retro);
            }
        });

        addProduct = (Button)findViewById(R.id.botonAddProduct);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addProducto = new Intent(MainMenuAdmin.this, AgregarProducto.class);
                startActivity(addProducto);
            }
        });

        cerrarSesion = (Button)findViewById(R.id.botonCerrarSesion);

        cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cerrarSesion = new Intent(MainMenuAdmin.this, MainActivity.class);
                startActivity(cerrarSesion);
            }
        });

    }
}
