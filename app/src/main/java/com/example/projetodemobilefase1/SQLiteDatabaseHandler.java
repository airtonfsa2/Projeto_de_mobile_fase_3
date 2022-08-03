package com.example.projetodemobilefase1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class SQLiteDatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "clinicaVeterinaria";


   //Criando a tabela de cliente

    private  static final String TABLE_CLIENTE = "Cliente";

    private static final String KEY_ID = "id";

    private static final String NOME_CLIENTE = "NomeCLiente";

    private static final String EMAIL_CLIENTE = "EmailCliente";



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
                + KEY_ID + "INTEGER PRIMARY KEY,"
                + NOME_CLIENTE + " TEXT,"
                + EMAIL_CLIENTE + " TEXT" + ")";

        String CREATE_TABLE_VETERINARIO = "CREATE TABLE " + TABLE_VETERINARIO + "("
                + KEY_ID_VET + "INTEGER PRIMARY KEY,"
                + NOME_VET + " TEXT,"
                + EMAIL_VETERINARIO + " TEXT,"
                + CRMV + "TEXT,"
                + CELULAR_VET + "TEXT,"
                + CPF_VET + "TEXT" + ")";

        db.execSQL(CREATE_CLIENTE_TABLE);
        db.execSQL(CREATE_TABLE_VETERINARIO);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {


    }

    public void addCliente(Cliente cliente){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(NOME_CLIENTE, cliente.getNome());
        values.put(EMAIL_CLIENTE, cliente.getEmail());

        db.insert(TABLE_CLIENTE, null, values);
        db.close();
    }

    void addVeterinario(Veterinario veterinario){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(NOME_VET, veterinario.getNome());
        values.put(EMAIL_VETERINARIO, veterinario.getEmail());
        values.put(CRMV, veterinario.getCrmv());
        values.put(CELULAR_VET, veterinario.getTelefone());
        values.put(CPF_VET, veterinario.getCpf());
    }

    public List<Cliente> getAllClientes(){
        List<Cliente> clienteLista = new ArrayList<Cliente>();

        String selecQuery =  "SELECT  * FROM " + TABLE_CLIENTE;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selecQuery, null);

        if (cursor.moveToFirst()){
            do{
                Cliente cliente = new Cliente();
                cliente.setId(Integer.parseInt(cursor.getString( 0 )));
                cliente.setNome(cursor.getString(2));
                cliente.setEmail(cursor.getString(2));
                clienteLista.add(cliente);
            }while (cursor.moveToNext());
        }
        return clienteLista;
    }
}
