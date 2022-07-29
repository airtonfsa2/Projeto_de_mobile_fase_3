package com.example.projetodemobilefase1;

public class Veterinario {
    String nome;
    String email;
    String crmv;
    String telefone;
    String cpf;

    public Veterinario(String nome, String email, String crmv, String telefone, String cpf){
        this.nome = nome;
        this.email = email;
        this.crmv = crmv;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome(){return nome; }
    public String getEmail(){return email; }
    public String getCrmv(){return crmv; }
    public String getTelefone(){return telefone; }
    public String getCpf(){return cpf; }
}
