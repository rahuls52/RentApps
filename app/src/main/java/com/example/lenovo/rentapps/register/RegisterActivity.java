package com.example.lenovo.rentapps.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lenovo.rentapps.R;
import com.example.lenovo.rentapps.manu.ManuActivity;
import com.example.lenovo.rentapps.model.RegisterUserModel;
import com.example.lenovo.rentapps.retrofit.RetrofitClient;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity  {

    RegisterUserModel registerUser;
    int id=0;

    EditText editTextEmail;
    EditText editTextUserName;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button buttonRegister = findViewById(R.id.register);
        //buttonRegister.setOnClickListener(this);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextUserName = findViewById(R.id.editTextUserName);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttonRegister.setOnClickListener(v -> {
            System.out.println("Registering User");
            registerUser = new RegisterUserModel();
            registerUser.setId(id++);
            String email = Objects.requireNonNull(editTextEmail.getText()).toString();
            registerUser.setEmail(email);
            String username = Objects.requireNonNull(editTextUserName.getText()).toString();
            registerUser.setUsername(username);
            String password = Objects.requireNonNull(editTextPassword.getText()).toString();
            registerUser.setPassword(password);

            Intent intent = new Intent(getApplicationContext(),ManuActivity.class);
            startActivity(intent);
            RetrofitClient.requestCall().getRegister(registerUser).enqueue(new Callback<String>()
            {
                @Override
                public void onResponse(@NonNull Call<String> call, @NonNull Response<String> response) {
                    System.out.println(response.body());
                }

                @Override
                public void onFailure(@NonNull Call<String> call, @NonNull Throwable t) {
                    System.out.println(t.getMessage());
                }
            });
        });
    }
}