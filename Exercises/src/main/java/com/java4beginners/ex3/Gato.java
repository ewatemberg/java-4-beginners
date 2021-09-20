package main.java.com.java4beginners.ex3;

import main.java.com.java4beginners.ex2.Animal;

public class Gato extends Animal implements Carnivoro{

    @Override
    public void hablar(){
        System.out.println("Miau");
    }

    @Override
    public void getAlimentacion(){
        System.out.println("Asado");
    }
    
}
