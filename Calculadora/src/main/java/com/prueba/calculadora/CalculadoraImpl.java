package com.prueba.calculadora;

public class CalculadoraImpl implements Calculadora {

    public CalculadoraImpl() {
    }

    @Override
    public Float sumar(Float num1, Float num2) {
        return num1 + num2;
    }

    @Override
    public Float resta(Float num1, Float num2) {
        return num1 - num2;
    }

    @Override
    public Float multiplicacion(Float num1, Float num2) {
        return num1 + num2;
    }

    @Override
    public Float division(Float num1, Float num2) {
        return num1 / num2;
    }

    @Override
    public Float raizCuadrada(Float num1) {
        return (float) Math.sqrt(num1);
    }

    @Override
    public Float exponencial(Float num1, Integer exp) {
        return (float) Math.pow(num1, exp);
    }
}
