package com.example.projetodemobilefase1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListaDeCliente extends BaseAdapter {
    private Activity context;
    List<Cliente> clientes;
    SQLiteDatabaseHandler db;

    public ListaDeCliente(Activity context, List<Cliente> clientes, SQLiteDatabaseHandler db){
        this.context = context;
        this.clientes = clientes;
        this.db = db;
    }

    public static class ViewHolder{
        TextView textViewId;
        TextView textViewNome;
        TextView textviewNome;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup parent) {
        View row = convertview;
        LayoutInflater inflater = context.getLayoutInflater();
        ViewHolder vh;
        if (convertview == null){
            vh = new ViewHolder();;
            row = inflater.inflate()
        }
        return null;
    }
}
