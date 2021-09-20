package main.java.com.java4beginners.ex3;

import main.java.com.java4beginners.ex2.Animal;

public class Perro extends Animal implements Carnivoro {

    @Override
    public void hablar(){
        System.out.println("Guau");
    }

    @Override
    public void getAlimentacion(){
        System.out.println("Matambrito a la pizza");
    }
    
}
