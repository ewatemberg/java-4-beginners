package main.java.com.java4beginners.ex1;

public class Cuadrado extends Figura {

    double base = 0D;

    Cuadrado(double base){
        this.base = base;
        super.nombre = "CUADRADO";
    }

    @Override
    public double calcularPerimetro(){
        return base * 4;
    } 

    @Override
    public double calcularArea(){
        return base * base;
    }
    
}
