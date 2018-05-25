package com.example.acer.nuevoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantalla3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        Button btre = (Button) findViewById(R.id.btre);
        btre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pan2= new Intent(pantalla3.this, pantalla2.class);
                startActivity(pan2);
            }
        });
    }
}
