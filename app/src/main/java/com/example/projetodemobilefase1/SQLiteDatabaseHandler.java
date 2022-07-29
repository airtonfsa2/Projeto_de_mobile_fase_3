package com.example.projetodemobilefase1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteDatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "clinicaVeterinaria";


   //Criando a tabela de cliente

    private  static final String TABLE_CLIENTE = "Cliente";

    private static final String KEY_ID = "id";

    private static final String NOME_CLIENTE = "NomeCLiente";

    private static final String EMAIL_CLIENTE = "EmailCliente";

    private static final String SENHA_CLIENTE = "SenhaCliente";


    //Criando a tabela de veterinario

    private static final String TABLE_VETERINARIO = "Veterinario";

    private static final String KEY_ID_VET = "id";

    private static final String NOME_VET = "Nome";

    private static final String EMAIL_VETERINARIO = "EmailVeterinario";

    private static final String CRMV = "CRMV";

    private static final String CELULAR_VET = "Celular";

    private static final String CPF_VET = "CPF";

    public SQLiteDatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }





    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CLIENTE_TABLE = "CREATE TABLE " + TABLE_CLIENTE + "("
                + NOME_CLIENTE + " TEXT,"
                + EMAIL_CLIENTE + " TEXT, "
                + SENHA_CLIENTE + " VARCHAR(255)" + ")";

        String CREATE_TABLE_VETERINARIO = "CREATE TABLE " + TABLE_VETERINARIO + "("
                 + NOME_VET + " TEXT,"
                + EMAIL_VETERINARIO + " TEXT,"
                + CRMV + "TEXT,"
                + CELULAR_VET + "TEXT,"
                + CPF_VET + "TEXT" + ")";

        db.execSQL(CREATE_CLIENTE_TABLE);
        db.execSQL(CREATE_TABLE_VETERINARIO);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
