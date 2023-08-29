package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;


public class SignUpActivity extends AppCompatActivity {

    Button confirm;
//
//    FirebaseAuth mAuth;
//    EditText editTextEmail, editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        confirm = findViewById(R.id.confirmButton);
//        mAuth = FirebaseAuth.getInstance();
//        editTextEmail = findViewById(R.id.email);
//        editTextPassword = findViewById(R.id.password);
//
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}