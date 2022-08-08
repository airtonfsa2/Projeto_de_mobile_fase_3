package com.example.projetodemobilefase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Cliente> clientes;
    SQLiteDatabaseHandler db;
    ListView listview;
    TextView texto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = findViewById(R.id.button3);
        Button button20 = findViewById(R.id.button20);
        db = new SQLiteDatabaseHandler(this);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent cadastro = new Intent(MainActivity.this, CadastroPaciente.class);
                startActivity(cadastro);

            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banco = new Intent(MainActivity.this, tela_consultar.class);
                startActivity(banco);
            }
        });


    }
}