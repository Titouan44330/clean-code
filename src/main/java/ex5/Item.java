package ex5;

public class Item {

    private String nom;
    private int poids;
    /**
     * categorie : Categorie de l'item en fonction de son poids
     * PETIT pour un petit Objet
     * MOYEN pour un objet de taille moyenne
     * GRAND pour un objet de grande taille
     */
    private String categorie;

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut poids
     *
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Setter pour l'attribut poids
     *
     * @param poids the poids to set
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }

    /**
     * Getter categorie
     *
     * @return la catégorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * Setter categorie
     *
     * @param categorie la nouvelle catégorie
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
