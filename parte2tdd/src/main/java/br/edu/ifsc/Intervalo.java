package br.edu.ifsc;

public class Intervalo {
    private final int horas;

    public Intervalo(int horas, int minutos, int segundos) {
        this.horas = horas;
    }

    public int horas() {
        return this.horas;
    }
}
