package com.genericlibrary.personal;

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

public class InicioSesion extends AppCompatActivity {


    FirebaseAuth auth = FirebaseAuth.getInstance();


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


        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = inputCorreoInicio.getText().toString();
                String password = inputContrasenaInicio.getText().toString();

                iniciarSesionConEmail(email, password);
            }
        });




    }



    public void iniciarSesionConEmail(String email , String password){


        auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            //Log.d(TAG, "signInWithEmail:success");
                            //FirebaseUser user = mAuth.getCurrentUser();
                            //updateUI(user);


                            irDashboard();

                            Toast.makeText(InicioSesion.this, "Inicio Exitoso", Toast.LENGTH_SHORT).show();

                        } else {
                            // If sign in fails, display a message to the user.
                            //Log.w(TAG, "signInWithEmail:failure", task.getException());
                            //Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                                    //Toast.LENGTH_SHORT).show();
                            //updateUI(null);

                            Toast.makeText(InicioSesion.this, "Valide sus credenciales", Toast.LENGTH_SHORT).show();
                        }
                    }
                });




    }

    public void irDashboard(){

        Intent intent = new Intent(this, DashBoard.class);
        startActivity(intent);
    }




}