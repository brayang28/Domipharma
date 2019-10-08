package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button iniciarSesion, registrar;
    EditText textRegis, textCorreo, textContra;

    //Variables de datos a registrar
    String correo = "";
    String pass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textRegis = (EditText)findViewById(R.id.regisCorreo);
        textCorreo = (EditText)findViewById(R.id.correo);
        textContra = (EditText)findViewById(R.id.password);

        registrar =(Button)findViewById(R.id.botonRegistrar);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent registrar = new Intent(MainActivity.this, registrar.class);
                startActivity(registrar);
            }
        });

        iniciarSesion =(Button)findViewById(R.id.botonIniciar);

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciarSesion = new Intent(MainActivity.this, ElegirVista.class);
                startActivity(iniciarSesion);
            }
        });



    }
}
