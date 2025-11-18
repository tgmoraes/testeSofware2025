package br.edu.ifsc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    private Livro montaLivroCom5Caps(){
        Autor joao = new Autor("João", 1);
        Autor mario = new Autor("mario", 2);
        Livro livro = LivroTestBuilder.umLivro()
                .comTitulo("Fazendo testes de software")
                .capitulo(new Capitulo("cap1", 10, joao))
                .capitulo(new Capitulo("cap2", 25, joao))
                .capitulo(new Capitulo("cap3", 45, joao))
                .capitulo(new Capitulo("cap4", 30, mario))
                .capitulo(new Capitulo("cap5", 20, mario))
                .build();
        return livro;
    }

    @Test
    @DisplayName("Testa total paginas")
    public void testaNumPaginas(){
        Livro l = montaLivroCom5Caps();
        assertEquals(130,l.getPaginas());
    }

    @Test
    @DisplayName("Testa leitura")
    public void testaNumPagsLidas(){
        //arrange
        Livro l = montaLivroCom5Caps();
        //action
        l.ler(100);
        //asssert
        assertEquals(100,l.getPagsLidas());
    }


    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "100, 100",
            "150, 130"
    })
    @DisplayName("teste de leitura de paginas parametrizado")
    public void testaNumPagsLidas2(int lido, int lidoEsperado){
        //arrange
        Livro l = montaLivroCom5Caps();
        //action
        l.ler(lido);
        //asssert
        assertEquals(lidoEsperado,l.getPagsLidas());
    }
}
