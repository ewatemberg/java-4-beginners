package main.java.com.java4beginners.ex1;

public class Runner {

    public static void main(String[] args) throws Exception {
        
        Figura circunferencia = new Circunferencia(5D);
        Figura cuadrado = new Cuadrado(2D);
        Figura rectangulo = new Rectangulo(3D, 4D);

        circunferencia.getInfoFigura();
        cuadrado.getInfoFigura();
        rectangulo.getInfoFigura();
    }
    
}
