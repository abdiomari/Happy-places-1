package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mSignInButton;
    private Button mSignUpButton;

//MainActivity is the landing page displayed when the app launches and after the splash screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//navigate to Sign in if user already has account
//        this is overridden by another functionality that allows for automatic sign in
//        acts as a failsafe in case it does not work

        mSignInButton = (Button)findViewById(R.id.sign_in_button);
        mSignInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Start Login activity
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
//navigate to Signup if user needs to create an account
        mSignUpButton = (Button)findViewById(R.id.sign_up_button);
        mSignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Start Signup activity
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}