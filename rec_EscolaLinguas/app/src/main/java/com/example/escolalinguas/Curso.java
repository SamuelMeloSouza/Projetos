package com.example.escolalinguas;

public class Curso {
    //variaveis
    private String tipoCurso;
    private String tipoPagamento;

    //construtor
    public Curso(String tipoCurso, String tipoPagamento) {
        this.tipoCurso = tipoCurso;
        this.tipoPagamento = tipoPagamento;
    }

    //Método para calcular o preço do curso
    public double calculoPrecoCurso() {
        double total = 0;
        if (tipoCurso.equals("COMBO")) {
            total = 2300.00;
            if (tipoPagamento.equals("AVISTA")) total = 2300.00 * 0.9;
            return total;
        } else {
            if (tipoCurso.equals("INGLES")){
            total = 1400.00;
            if (tipoPagamento.equals("AVISTA")) total = 1400.00 * 0.9;
            return total;
        } else{
            total = 1200.00;
            if (tipoPagamento.equals("AVISTA")) total = 1200.00 * 0.9;
            return total;
        }
    }
}

