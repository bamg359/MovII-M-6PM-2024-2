package com.genericlibrary.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class InicioSesion extends AppCompatActivity {


    Button btnIniciarSesion;
    Button btnVolverHome2;
    EditText inputCorreoInicio;
    EditText inputContrasenaInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);


        inputCorreoInicio = findViewById(R.id.input_correo_inicio);
        inputContrasenaInicio = findViewById(R.id.input_password_inicio);
        btnIniciarSesion = findViewById(R.id.btn_iniciar_sesion);
        btnVolverHome2 = findViewById(R.id.btn_volver_home2);




    }




}