package com.example.salbian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main11Activity extends AppCompatActivity {

    EditText textView20, textView21, textView22, textView23;
    Button btnLogin5;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";
    private static final String KEY_ALAMAT = "alamat";
    private static final String KEY_NO = "nomor";
    private static final String KEY_EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        textView20 = findViewById(R.id.textView20);
        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        btnLogin5 = findViewById(R.id.btnLogin5);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        btnLogin5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_NAME, textView20.getText().toString());
                editor.putString(KEY_ALAMAT, textView21.getText().toString());
                editor.putString(KEY_NO, textView22.getText().toString());
                editor.putString(KEY_EMAIL, textView23.getText().toString());
                editor.apply();
                onBackPressed();
                Intent intent = new Intent(Main11Activity.this, Main8Activity.class);
                startActivity(intent);

                Toast.makeText(Main11Activity.this, "Success", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
