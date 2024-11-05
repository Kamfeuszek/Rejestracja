package com.example.rejestracja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button confirm;
    private EditText email;
    private EditText password;
    private EditText confirmPassword;
    private TextView changeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confirm = findViewById(R.id.confirm);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPassword);
        changeText = findViewById(R.id.changeText);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailText = email.getText().toString().trim();
                String passwordText = password.getText().toString().trim();
                String confirmPasswordText = confirmPassword.getText().toString().trim();

                if(emailText.contains("@")) {
                    if(passwordText.equals(confirmPasswordText)) {
                        changeText.setText("Witaj " + emailText);
                    } else {
                        changeText.setText("Hasła się różnią");
                    }
                } else {
                    changeText.setText("Nieprawidłowy adres e-mail");
                }
            }
        });

    }
}