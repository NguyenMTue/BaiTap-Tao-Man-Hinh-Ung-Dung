package com.example.bttaomanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private EditText edtFullName, edtEmail, edtPassword, edtConfirmPassword;
    private Button btnSignUp;
    private TextView txtSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Ánh xạ view
        edtFullName = findViewById(R.id.edtFullName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        btnSignUp = findViewById(R.id.btnSignUp);
        txtSignIn = findViewById(R.id.txtSignIn);

        // Bắt sự kiện Sign Up
        btnSignUp.setOnClickListener(v -> {
            // Ví dụ: quay lại MainActivity
            Intent intent = new Intent(Register.this, MainActivity.class);
            startActivity(intent);
        });

        // Bắt sự kiện Sign In
        txtSignIn.setOnClickListener(v -> {
            // Ví dụ: quay lại MainActivity
            Intent intent = new Intent(Register.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
