package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets","PETIT"));
        caisses.add(new Caisse("Moyens objets","MOYEN"));
        caisses.add(new Caisse("Grands objets","GRAND"));
    }

    public void addItem(Item item) {
        String itemCategPoids = item.getCategorie();
        for(Caisse uneCaisse : caisses){
            if(uneCaisse.getCategorie().equals(itemCategPoids)) {
                uneCaisse.getItems().add(item);
                break;
            }
        }
    }

    public int taille() {
        Integer taille = 0;
        for(Caisse uneCaisse : caisses){
            taille += uneCaisse.getItems().size();
        }
        return taille;
    }
}
