package com.example.projetodemobilefase1;

public class Cadastro {
    String nome;
    String email;
    String senha;

    public Cadastro(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome(){return nome; }
    public String getEmail(){return email; }
    public String getSenha(){return senha;}


}
