package main.java.com.java4beginners.ex2;

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
