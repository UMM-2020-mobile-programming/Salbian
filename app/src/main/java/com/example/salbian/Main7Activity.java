package com.example.salbian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    private TextView myprofile;
    TextView textView;
    private TextView About;
    private TextView Logout;

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        myprofile = findViewById(R.id.myprofile);
        About = findViewById(R.id.About);
        Logout = findViewById(R.id.Logout);
        textView = findViewById(R.id.textView);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_NAME, null);

        if (name != null){
            textView.setText(name);
        }

        myprofile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(Main7Activity.this, Main8Activity.class);
                startActivity(i);
            }
        });
        About.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(Main7Activity.this, Main9Activity.class);
                startActivity(i);
            }
        });
        Logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(Main7Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
