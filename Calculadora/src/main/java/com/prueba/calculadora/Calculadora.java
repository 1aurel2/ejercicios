package com.prueba.calculadora;

import java.math.BigDecimal;

public interface Calculadora  {

    Float sumar (Float num1, Float num2);
    Float resta (Float num1, Float num2);
    Float multiplicacion (Float num1, Float num2);
    Float division (Float num1, Float num2);
    Float raizCuadrada (Float num1);
    Float exponencial (Float num1, Integer exp);

}
