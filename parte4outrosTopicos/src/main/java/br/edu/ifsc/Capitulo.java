package br.edu.ifsc;

public class Capitulo {
    private final String titulo;
    private final int paginas;
    private final Autor autor;

    public Capitulo(String titulo, int paginas, Autor autor){
        if(paginas<1) throw new RuntimeException("capitulo tem que ter ao menos uma página");
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public Autor getAutor(){
        return this.autor;
    }
    public int getPaginas(){
        return this.paginas;
    }
}
