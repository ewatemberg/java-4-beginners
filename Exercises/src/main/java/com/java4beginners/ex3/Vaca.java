package main.java.com.java4beginners.ex3;

import main.java.com.java4beginners.ex2.Animal;

public class Vaca extends Animal implements Hervivoro {

    @Override
    public void hablar(){
        System.out.println("Mu");
    }

    @Override
    public void getAlimentacion(){
        System.out.println("Salteado de vegetales");
    }
    
}
