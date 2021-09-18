package main.java.com.java4beginners.ex1;

public class Rectangulo extends Figura {

    double b = 0D;
    double h = 0D;

    Rectangulo(double base, double altura){
        this.b = base;
        this.h = altura;
        super.nombre = "RECTANGULO";
    }

    @Override
    public double calcularPerimetro(){
        return (b + h) * 2;
    } 

    @Override
    public double calcularArea(){
        return b * h;
    }
    
}
