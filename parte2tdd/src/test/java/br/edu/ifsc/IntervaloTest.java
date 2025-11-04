package br.edu.ifsc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntervaloTest {
    @Test
    @DisplayName(value="teste1: criacao intervalo")
    public void testeCriacao(){
        Intervalo intervalo = new Intervalo(3,4,5);
        Assertions.assertEquals(2, intervalo.horas());
    }
}
