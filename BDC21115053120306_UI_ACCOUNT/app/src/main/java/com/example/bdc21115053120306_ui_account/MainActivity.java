package com.example.bdc21115053120306_ui_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button signin;
    private Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        signin = findViewById(R.id.button_signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                Intent intent_signin = new Intent(MainActivity.this, Signin.class);
                startActivity(intent_signin);
            }
        });
        signup = findViewById(R.id.button_signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_signup = new Intent(MainActivity.this, Signup.class);
                startActivity(intent_signup);
            }
        });
    }
}