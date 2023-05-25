package com.example.individual5_inicio_sesion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textNombre;
        EditText textApellido;
        EditText textEmail;
        EditText textPassword;
        Button buttonRegistrarse;

        textNombre = (EditText) findViewById (R.id.textNombre);
        textApellido = (EditText) findViewById (R.id.textApellido);
        textEmail = (EditText) findViewById(R.id.textEmail);
        textPassword = (EditText) findViewById(R.id.textPassword);
        buttonRegistrarse =(Button) findViewById(R.id.buttonRegistrarse);





    }
}