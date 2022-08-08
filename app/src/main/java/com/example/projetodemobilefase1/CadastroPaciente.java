package com.example.projetodemobilefase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroPaciente extends AppCompatActivity {

    SQLiteDatabaseHandler db;
    Button button6;
    EditText nomeEdit;
    EditText emailCliente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_paciente);
        db = new SQLiteDatabaseHandler(this);
        button6 = (Button) findViewById(R.id.button6);
        nomeEdit = (EditText) findViewById(R.id.editTextTextPersonName);
        emailCliente = (EditText) findViewById(R.id.editTextTextPersonName3);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeCliente = nomeEdit.getText().toString();
                String emailCliente2 = emailCliente.getText().toString();
                Cliente cliente = new Cliente(nomeCliente, emailCliente2);
                db.addCliente(cliente);

                Context context = getApplicationContext();
                CharSequence text = "Tudo Certo";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent voltar =  new Intent(CadastroPaciente.this, MainActivity.class);
                startActivity(voltar);
                


                
            }
        });




        //button6.setOnClickListener(new View.OnClickListener() {
            /*@Override
            public void onClick(View view) {
                String nomeCliente = nomeEdit.getText().toString();
                String emailCliente2 = emailCliente.getText().toString();
                Cliente cliente = new Cliente(nomeCliente, emailCliente2);
                db.addCliente(cliente);

            }
        });
    }*/
    }

}