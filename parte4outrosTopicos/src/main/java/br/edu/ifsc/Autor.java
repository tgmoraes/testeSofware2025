package br.edu.ifsc;

public class Autor {
    private final String nome;
    private final int id;

    public Autor(String nome, int id){
        this.nome = nome;
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }
    public int getId() {
        return this.id;
    }
}
