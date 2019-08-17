package com.example.lenovo.rentapps.register;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lenovo.rentapps.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener
{

    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email= findViewById(R.id.email);
        password = findViewById(R.id.password);

        findViewById(R.id.login).setOnClickListener(this);
        findViewById(R.id.register).setOnClickListener(this);

        Button login  = findViewById(R.id.login);
        login.setOnClickListener(LoginActivity.this);

        Button register = findViewById(R.id.register);
        register.setOnClickListener(this);
        {
       startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
       finish();
        }
    }

    private void userlogin() {

        String emails=email.getText().toString().trim();
        String passwords= password.getText().toString().trim();

        if (emails.isEmpty()){
            email.setError("Email is required");
            email.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(emails).matches()){
            email.setError("Enter a Valid Email");
            email.requestFocus();
            return;

        }
        if (passwords.isEmpty()){
            password.setError("Password is required");
            password.requestFocus();
            return;
        }
        if (passwords.length()<6){
            password.setError("Password Should be 6 Character long ");
            password.requestFocus();
            return; 
        }
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.login:
                userlogin();
                break;
            case R.id.register:
                break;
        }
    }


}
