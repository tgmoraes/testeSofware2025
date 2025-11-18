package br.edu.ifsc;


import java.util.ArrayList;
import java.util.List;

public class Livro {
    private final String titulo;
    private final List<Capitulo> capitulos;
    private int pagslidas;

    public Livro(String titulo){
        this.titulo = titulo;
        capitulos = new ArrayList<Capitulo>();
        this.pagslidas=0;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void addCapitulo(Capitulo c){
        this.capitulos.add(c);
    }

    public int getPaginas(){
        int total = 0;
        for(Capitulo e :this.capitulos)
            total += e.getPaginas();

        return total;
    }

    public int getPagsLidas(){
        return this.pagslidas;
    }

    public void ler(int pags){
        int total = this.getPaginas();
        if (total < (this.pagslidas+pags))
            this.pagslidas = total;
        else
            this.pagslidas += pags;
    }
    public void recomecar(){
        this.pagslidas = 0;
    }
    public int getTotalCaps(){
        return this.capitulos.size();
    }

    //public void recomecar (int cap)
}
