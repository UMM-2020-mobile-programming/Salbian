package com.example.salbian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {
    private ImageView home;
    private ImageView transaksi;
    private ImageView profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        home = findViewById(R.id.home);
        transaksi = findViewById(R.id.transaksi);
        profil = findViewById(R.id.profil);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(i);
            }
        });
        transaksi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(Main4Activity.this, Main10Activity.class);
                startActivity(i);
            }
        });
        profil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(Main4Activity.this, Main7Activity.class);
                startActivity(i);
            }
        });
    }
}
