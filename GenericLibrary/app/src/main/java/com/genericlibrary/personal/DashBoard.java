package com.genericlibrary.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DashBoard extends AppCompatActivity {



    Button btnCerrarSesion;
    ImageButton imageBtnIrDatosUsuario;

    ImageButton imgBtnIrRegistroLibro;

    ImageButton imgBtnGestionPrestamo;

    ImageButton imgBtnRegistrarPrestamo;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        btnCerrarSesion = findViewById(R.id.btn_cerrar_sesion);
        imageBtnIrDatosUsuario = findViewById(R.id.btnIrDatosUsuario);
        imgBtnIrRegistroLibro = findViewById(R.id.btnRegistrarLibros);
        imgBtnGestionPrestamo = findViewById(R.id.btnGestionarPretamos);
        imgBtnRegistrarPrestamo = findViewById(R.id.btnRegistrarPrestamo);


        imageBtnIrDatosUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irDatosUsuario();
            }
        });

        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarSesion();
            }
        });






    }


    public void irDatosUsuario(){
        Intent intent = new Intent(this, UserData.class);
        startActivity(intent);
    }

    public void cerrarSesion(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }



}