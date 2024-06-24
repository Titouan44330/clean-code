package ex3;

import java.util.ArrayList;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        ArrayList<Animal> lstAnimaux = new ArrayList<Animal>();

        Animal gazelle = new Animal("Gazelle", "MAMMIFERE", "HERBIVORE");
        lstAnimaux.add(gazelle);
        Animal zebre = new Animal("Zèbre", "MAMIFERE", "HERBIVORE");
        lstAnimaux.add(zebre);
        Animal lion = new Animal("Lion", "MAMMIFERE", "HERBIVORE");
        lstAnimaux.add(lion);
        Animal panthere = new Animal("Panthère", "MAMMIFERE", "CARNIVORE");
        lstAnimaux.add(panthere);
        Animal requinBlanc = new Animal("Requin blanc", "POISSON", "HERBIVORE");
        lstAnimaux.add(requinBlanc);
        Animal truiteDoree = new Animal("Truite dorée", "POISSON", "HERBIVORE");
        lstAnimaux.add(truiteDoree);
        Animal boaConstrictor = new Animal("Boa constrictor", "SERPENT", "CARNIVORE");
        lstAnimaux.add(boaConstrictor);
        Animal python = new Animal("Python", "SERPENT", "CARNIVORE");
        lstAnimaux.add(python);

        zoo.addListAnimal(lstAnimaux);
    }

}
