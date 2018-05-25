package com.example.acer.nuevoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button boton = (Button) findViewById(R.id.buton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText)findViewById(R.id.usuario)).getText().toString();
                String contraseña = ((EditText)findViewById(R.id.contraseña)).getText().toString();
                if (usuario.equals("admin")&& contraseña.equals("admin"))
                {
                    Intent menu= new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(menu);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Error Verifica tus datos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
