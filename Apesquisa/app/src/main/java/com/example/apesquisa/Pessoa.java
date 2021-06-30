package com.example.apesquisa;

public class Pessoa {
    private String nome;
    private String genero;
    private String regiao;

    //construtor
    public Pessoa(String nome, String genero, String regiao) {
        this.nome = nome;
        this.genero = genero;
        this.regiao = regiao;
    }
    //método
    public String mostrarDados(){
        return "Nome: " + this.nome +
                "\nGênero: " +  this.genero +
                "\nRegião: " + this.regiao;
    }
}
