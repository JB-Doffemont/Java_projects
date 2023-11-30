package tp11.strategy;

import tp11.Commande;
import tp11.Livre;

import java.util.List;

/*****
 * Stratégie correspondant au mode d'expédition : Mondial Relay
 */
public class FraisPortMondialRelayStrategy implements FraisPortStrategy {

    private Commande contexte;

    public FraisPortMondialRelayStrategy(Commande contexte) {
        this.contexte = contexte;
    }

    /***
     * Regles de calcul :
     * - si le poids total de la commande est inférieur ou égal à 3kg, fdp = 4€
     * - au delà de 3kg, fdp = 8€
     */
    @Override
    public double calculerFraisPort() {
        List<Livre> livres = contexte.getLivres(null); // Assuming you have a method to get the books in the order
        double poidsTotal = calculerPoidsTotal(livres);

        if (poidsTotal <= 3.0) {
            return 4.0;
        } else {
            return 8.0;
        }
    }

    // Méthode pour calculer le poids total des livres
    private double calculerPoidsTotal(List<Livre> livres) {
        double poidsTotal = 0.0;
        for (Livre livre : livres) {
            poidsTotal += livre.getPoids();
        }
        return poidsTotal;
    }
}
