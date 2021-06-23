package com.example.rec_trapezio;

public class Trapezio {
    //
    private double baseMenor, baseMairo, altura;

    //construtor
    public Trapezio(double baseMenor, double baseMairo, double altura) {
        this.baseMenor = baseMenor;
        this.baseMairo = baseMairo;
        this.altura = altura;
        //método
    }
    public double calcularArea(){
        return (this.baseMenor + this.baseMairo )*this.altura/2;
    }
}
