package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class realizarDomicilio extends AppCompatActivity {

    Button add;
    ImageButton retro;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_domicilio);

        mp = MediaPlayer.create(this, R.raw.meep);
        add = (Button)findViewById(R.id.botonRealDomi);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Toast noti = Toast.makeText(realizarDomicilio.this, "¡Domicilio realizado!", Toast.LENGTH_SHORT);
                noti.show();
                Intent add = new Intent(realizarDomicilio.this, MainMenuClient.class);
                startActivity(add);
            }
        });

        retro = (ImageButton)findViewById(R.id.botonRetroceder);

        retro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retro = new Intent(realizarDomicilio.this, Carrito.class);
                startActivity(retro);
            }
        });
    }
}
