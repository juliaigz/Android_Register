package com.example.individual5_inicio_sesion;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

     TextView mensaje;

     String nombre;
     String apellido;
     String correo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mensaje = (TextView) findViewById (R.id.mensaje);

        Intent intent = getIntent();

        nombre = intent.getStringExtra("nombre");
        apellido = intent.getStringExtra("apellido");
        correo = intent.getStringExtra("correo");

        mensaje.setText("nombre:"+nombre + "apellido : "+ apellido+ "correo : "+ correo );






    }
}