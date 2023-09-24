package com.example.bdc21115053120306_ui_account;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {
    private Button tvhome;
    private Button signin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        tvhome = findViewById(R.id.bttextView);
        tvhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_home= new Intent(Signup.this, MainActivity.class);
                startActivity(intent_home);
            }
        });

        signin2 = findViewById(R.id.button_signin2);
        signin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_signin2 = new Intent(Signup.this, Signin.class);
                startActivity(intent_signin2);
            }
        });
    }
}
