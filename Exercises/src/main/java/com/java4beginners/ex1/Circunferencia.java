package main.java.com.java4beginners.ex1;

import java.lang.Math;

public class Circunferencia extends Figura {

    private double radio = 0D;
    // Puedo usar la librería de java o definir una constante con el valor de PI.
    // Esta comentado el codigo porque uso la lib de java.
    //private final double PI = 3.14D;

    Circunferencia(double radio){
        this.radio = radio;
        super.nombre = "CIRCUNFERENCIA";
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    } 

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
        //return Math.PI*(Math.pow(radio,2)
    }
    
}
