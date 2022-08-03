package com.example.projetodemobilefase1;

public class Cadastro {
    String nome;
    String email;
    String senha;

    public Cadastro(String nome, String email){
        this.nome = nome;
        this.email = email;

    }

    public String getNome(){return nome; }
    public String getEmail(){return email; }



}
