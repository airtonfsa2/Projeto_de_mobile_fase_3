package com.example.projetodemobilefase1;

public class Cliente {
    public Object setNome;
    String nome;
    String email;
    int id;

    public Cliente(String nome, String email, int id) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }


    public Cliente(){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){return nome; }
    public String getEmail(){return  email;}
    public int getId(){return id;}

    public void setId(int id) { this.id = id;}
    public void setNome(String nome){this.nome = nome;}
    public void setEmail(String email){this.email = email;}

}
