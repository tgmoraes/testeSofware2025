package br.edu.ifsc;

import java.util.ArrayList;
import java.util.List;

public class LivroTestBuilder {
    private String titulo;
    private List<Capitulo> capitulos = new ArrayList<>();
    private int pagslidas;

    public LivroTestBuilder comTitulo(String titulo){
        this.titulo = titulo;
        return this;
    }

    public LivroTestBuilder capitulo(Capitulo c){
        this.capitulos.add(c);
        return this;
    }

    public LivroTestBuilder lido(int pags){
        this.pagslidas = pags;
        return this;
    }

    public Livro build(){
        Livro l = new Livro(this.titulo);
        for(Capitulo c: this.capitulos)
            l.addCapitulo(c);
        l.ler(this.pagslidas);
        return l;
    }

    public static LivroTestBuilder umLivro(){
        return new LivroTestBuilder();
    }
}
