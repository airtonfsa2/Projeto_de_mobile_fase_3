package com.example.projetodemobilefase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

import java.net.PasswordAuthentication;

public class Teladecadastro extends AppCompatActivity {
    private TextInputEditText nome, email;
    private TextInputEditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teladecadastro);

        nome = findViewById(R.id.nomeCadastro);
        email = findViewById(R.id.emailCadastro);
        senha = findViewById(R.id.senhaCadastro);




    }
}