package com.example.domipharma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AgregarProducto extends AppCompatActivity {

    Button add;
    ImageButton retro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        add = (Button)findViewById(R.id.botonAdd);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast noti = Toast.makeText(AgregarProducto.this, "¡Producto agregado!", Toast.LENGTH_SHORT);
                noti.show();
                Intent add = new Intent(AgregarProducto.this, MainMenuAdmin.class);
                startActivity(add);
            }
        });

        retro = (ImageButton)findViewById(R.id.botonRetroceder);

        retro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retro = new Intent(AgregarProducto.this, MainMenuAdmin.class);
                startActivity(retro);
            }
        });
    }
}
