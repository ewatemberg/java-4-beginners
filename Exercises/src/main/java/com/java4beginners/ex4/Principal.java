package main.java.com.java4beginners.ex4;

public class Principal {

    public static void main(String[] args) throws Exception {
        
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();
        Profe profe = new Profe();

        comerAnimal(perro);
        comerAnimal(gato);
        comerAnimal(vaca);
        comerAnimal(profe);
    }

    private static void comerAnimal(Animal animal){
        animal.comer();
    }
    
}
