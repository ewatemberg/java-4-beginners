package main.java.com.java4beginners.ex3;

import main.java.com.java4beginners.ex2.Animal;

public class Principal {

    public static void main(String[] args) throws Exception {
        
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        hablarAnimal(perro);
        hablarAnimal(gato);
        hablarAnimal(vaca);
    }

    private static void hablarAnimal(Animal animal){
        animal.hablar();
    }
    
}
