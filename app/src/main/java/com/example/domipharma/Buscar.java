package com.example.domipharma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Buscar extends AppCompatActivity {

    Button contacto, historial, cuenta;
    ImageButton retro, car;
    EditText buscar;
    TextView produc, desc, valor;

    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

    /*    buscar = (EditText)findViewById(R.id.editTextBuscar);
        produc = (TextView)findViewById(R.id.textProduct1);
        desc = (TextView)findViewById(R.id.textdp1);
        valor = (TextView)findViewById(R.id.textvp1);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("Producto").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    String nombre = dataSnapshot.child("nombre").getValue().toString();
                    String descripcion = dataSnapshot.child("descripcion").getValue().toString();
                    int precio = Integer.parseInt(dataSnapshot.child("precio").getValue().toString());

                    produc.setText(nombre);
                    desc.setText(descripcion);
                    valor.setText(precio);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });*/

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
