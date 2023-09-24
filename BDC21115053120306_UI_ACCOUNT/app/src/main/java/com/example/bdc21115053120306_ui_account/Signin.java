package com.example.bdc21115053120306_ui_account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Signin extends AppCompatActivity {
    private Button tvhome;
    private Button signup2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        tvhome = findViewById(R.id.bttextView);
        tvhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_home= new Intent(Signin.this, MainActivity.class);
                startActivity(intent_home);
            }
        });

        signup2 = findViewById(R.id.button_signup2);
        signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_signup2 = new Intent(Signin.this, Signup.class);
                startActivity(intent_signup2);
            }
        });
    }
}
