package com.genericlibrary.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    Button btnRegistro;
    Button btnInicioSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnRegistro = findViewById(R.id.btn_ir_registro);

        btnInicioSesion = findViewById(R.id.btn_ir_inicio_sesion);


        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irIniciosesion();
            }
        });


        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irRegistro();
            }
        });



    }

    public void irRegistro(){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }

    public void irIniciosesion(){

        Intent intent = new Intent(this, InicioSesion.class);
        startActivity(intent);
    }



}