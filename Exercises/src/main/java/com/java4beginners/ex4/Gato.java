package main.java.com.java4beginners.ex4;

import main.java.com.java4beginners.ex3.Carnivoro;

public class Gato extends Animal implements Carnivoro {

    @Override
    public void hablar(){
        System.out.println("Miau");
    }

    @Override
    public void getAlimentacion(){
        System.out.println("Asado");
    }

    @Override
    public void comer(){
        getAlimentacion();
    }
    
}
