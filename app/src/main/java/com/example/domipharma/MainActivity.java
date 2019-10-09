package com.example.domipharma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    Button iniciarSesion, registrar;
    EditText textCorreo, textContra;

    //Variables de datos a registrar
    String correo = "";
    String pass = "";

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

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
                correo = textCorreo.getText().toString();
                pass = textContra.getText().toString();

                if(!correo.isEmpty() && !pass.isEmpty()){
                    loginUser();
                }


            }
        });



    }

    private void loginUser(){
        mAuth.signInWithEmailAndPassword(correo, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent iniciarSesion = new Intent(MainActivity.this, ElegirVista.class);
                    startActivity(iniciarSesion);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "No se pudo iniciar sesion", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
