package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElegirVista extends AppCompatActivity {

    Button admin, cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_vista);

        cliente = (Button)findViewById(R.id.botonMenuClient);

        cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cliente = new Intent(ElegirVista.this, MainMenuClient.class);
                startActivity(cliente);
            }
        });

        admin = (Button)findViewById(R.id.botonMenuAdmin);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admin = new Intent(ElegirVista.this, MainMenuAdmin.class);
                startActivity(admin);
            }
        });

    }
}
