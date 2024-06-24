package ex2;

public class LivretA extends CompteBancaire {
    /**
     * Ce constructeur est utilisé pour créer un compte de type Compte Bancaire
     *
     * @param type                      = CC
     * @param solde                    représente le solde du compte
     * @param tauxRemuneration        représente le taux de rémunération,
     */
    public LivretA(String type, double solde, double tauxRemuneration) {
        super(type, solde, tauxRemuneration);
    }

}
