package br.edu.ifsc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntervaloTest {
    private final Intervalo intervalo = new Intervalo(3,64,5);

    @Test
    @DisplayName(value="teste1: criacao intervalo")
    public void testeCriacao(){

        Assertions.assertEquals(4, intervalo.horas());
        Assertions.assertEquals(4, intervalo.minutos());
        Assertions.assertEquals(5, intervalo.segundos());

    }
    @Test
    @DisplayName(value="deve retornar total de minutos")
    public void testeTotalMinutos(){
        Assertions.assertEquals(244, intervalo.totalMinutos());
    }
}
