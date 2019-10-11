package com.example.domipharma;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;
import java.util.Map;

public class AgregarProducto extends AppCompatActivity {

    Button add, addImg;
    ImageButton retro;
    EditText nom, desc, cant, pre;
    static int GALERY_INTENT;

    DatabaseReference myRootReference;
    StorageReference mStorage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        myRootReference = FirebaseDatabase.getInstance().getReference();
        mStorage = FirebaseStorage.getInstance().getReference();

        addImg = (Button)findViewById(R.id.botonAddImg);
        add = (Button)findViewById(R.id.botonAdd);
        nom = (EditText)findViewById(R.id.editText4);
        desc = (EditText)findViewById(R.id.editText);
        cant = (EditText)findViewById(R.id.editText3);
        pre = (EditText)findViewById(R.id.editText2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nom.getText().toString();
                String descrip = desc.getText().toString();
                int cantidad = Integer.parseInt(cant.getText().toString());
                int precio = Integer.parseInt(pre.getText().toString());

                agregarProductosFirebase(nombre, descrip, cantidad, precio);

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

        addImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, GALERY_INTENT);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == GALERY_INTENT && resultCode == RESULT_OK){
            Uri uri = data.getData();

            StorageReference filePath = mStorage.child("Fotos").child(uri.getLastPathSegment());
            filePath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Toast.makeText(AgregarProducto.this, "Se guardo la imagen correctamente", Toast.LENGTH_SHORT).show();
                }
            });

        }

    }

    private void agregarProductosFirebase(String nombre, String descrip, int cantidad, int precio) {
        Map<String, Object> datosProducto = new HashMap<>();
        datosProducto.put("nombre", nombre);
        datosProducto.put("descripcion", descrip);
        datosProducto.put("cantidad", cantidad);
        datosProducto.put("precio", precio);

        myRootReference.child("Producto").push().setValue(datosProducto);
    }
}
