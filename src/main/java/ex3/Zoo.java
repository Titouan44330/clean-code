package ex3;

import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animaux;
    private Double taille;

    public Zoo(String nom) {
        this.nom = nom;
    }

    public void addUnAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void addListAnimal(List<Animal> animaux) {
        for(Animal unAnimal : animaux) {
            animaux.add(unAnimal);
        }
    }

    public void afficherListeAnimaux() {
        for (Animal unAnimal : animaux) {
            System.out.println(unAnimal.getNom() + " " + unAnimal.getType() + " " + unAnimal.getComportement());
        }
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }
}
