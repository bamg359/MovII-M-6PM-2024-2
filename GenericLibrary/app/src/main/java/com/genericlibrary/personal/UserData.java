package com.genericlibrary.personal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserData extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference().child("Usuario");

    Button btnVolverDashBoard1;
    Button btnBuscarUsuario;
    EditText inputIdUsuario;
    TextView mostrarIdUsuario;
    TextView mostrarNombreUsuario;
    TextView mostrarApellidoUsuario;
    TextView mostrarCorreoUsuario;
    TextView mostrarTelefonoUsuario;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);


        btnVolverDashBoard1 = findViewById(R.id.btn_volver_dashboard_1);
        btnBuscarUsuario= findViewById(R.id.btn_buscar_usuario);
        inputIdUsuario = findViewById(R.id.input_buscar_id);
        mostrarIdUsuario = findViewById(R.id.txt_data_id);
        mostrarNombreUsuario = findViewById(R.id.txt_data_nombre);
        mostrarApellidoUsuario = findViewById(R.id.txt_data_apellido);
        mostrarCorreoUsuario = findViewById(R.id.txt_data_correo);
        mostrarTelefonoUsuario = findViewById(R.id.txt_data_telefono);


        btnBuscarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recuperarDataUsuario();
            }
        });



    }

    public void recuperarDataUsuario(){

        String identificacion = inputIdUsuario.getText().toString();

        DatabaseReference usuarioReferencia = reference.child(identificacion);

        usuarioReferencia.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                if(snapshot.exists()){

                    String id = inputIdUsuario.getText().toString();
                    mostrarIdUsuario.setText("Id: " + id);

                    String nombre = snapshot.child("Name").getValue(String.class);
                    mostrarNombreUsuario.setText("Nombre: "+ nombre);

                    String apellido = snapshot.child("LastName").getValue(String.class);
                    mostrarApellidoUsuario.setText("Apellido" + apellido);

                    String correo = snapshot.child("Email").getValue(String.class);
                    mostrarCorreoUsuario.setText("Correo: " + correo);

                    String telefono = snapshot.child("Phone").getValue(String.class);
                    mostrarTelefonoUsuario.setText("Telefono" + telefono);

                }else{
                    Toast.makeText(UserData.this, "Usuario no existe", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }



}