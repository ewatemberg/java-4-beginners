package main.java.com.java4beginners.ex1;

public abstract class Figura {

    String nombre;

    public void getInfoFigura(){
        System.out.println("El perimetro total del/la " + nombre + " es: " + this.calcularPerimetro());
        System.out.println("El area total del/la " + nombre + " es: " + this.calcularArea());
    }

    public abstract double calcularPerimetro();   

    public abstract double calcularArea();

}