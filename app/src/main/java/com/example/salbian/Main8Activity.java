package com.example.salbian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {

    TextView textView5,textView8,textView10,textView12;
    Button btnLogin2;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";
    private static final String KEY_ALAMAT = "alamat";
    private static final String KEY_NO = "nomor";
    private static final String KEY_EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        textView5 = findViewById(R.id.textView5);
        textView8 = findViewById(R.id.textView8);
        textView10 = findViewById(R.id.textView10);
        textView12 = findViewById(R.id.textView12);
        btnLogin2 = findViewById(R.id.btnLogin2);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_NAME, null);
        String alamat = sharedPreferences.getString(KEY_ALAMAT, null);
        String nomor = sharedPreferences.getString(KEY_NO, null);
        String email = sharedPreferences.getString(KEY_EMAIL, null);

        if (name != null || alamat != null || nomor != null || email != null){
            textView5.setText(name);
            textView8.setText(alamat);
            textView10.setText(nomor);
            textView12.setText(email);
        }

        btnLogin2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(Main8Activity.this, Main11Activity.class);
                startActivity(i);
            }
        });
    }
}
