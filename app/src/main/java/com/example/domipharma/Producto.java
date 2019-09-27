package com.example.domipharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Producto extends AppCompatActivity {

    Button carrito, comprar, retroceder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        retroceder = (Button)findViewById(R.id.botonRetroceder);

        retroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retroceder = new Intent(Producto.this, MainMenuAdmin.class);
                startActivity(retroceder);
            }
        });
    }
}
