package main.java.com.java4beginners.ex4;

import main.java.com.java4beginners.ex3.Hervivoro;

public class Vaca extends Animal implements Hervivoro {

    @Override
    public void hablar(){
        System.out.println("Mu");
    }

    @Override
    public void getAlimentacion(){
        System.out.println("Pasto con pesto");
    }

    @Override
    public void comer(){
        getAlimentacion();
    }
    
}
