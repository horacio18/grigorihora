package com.example.acer.nuevoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        Button btagregar = (Button) findViewById(R.id.btagregar);
        btagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pan3= new Intent(pantalla2.this, pantalla3.class);
                startActivity(pan3);
            }
        });
    }
}
