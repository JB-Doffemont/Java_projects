package tp11.strategy;

import tp11.Commande;
import tp11.Livre;
import tp11.repository.LivreRepository;

import java.util.List;

/*****
 * Stratégie correspondant au mode d'expédition : Colissimo
 */
public class FraisPortColissimoStrategy implements FraisPortStrategy {

    private Commande contexte;
    private LivreRepository livreRepository;

    public FraisPortColissimoStrategy(Commande contexte, LivreRepository livreRepository) {
        this.contexte = contexte;
        this.livreRepository = livreRepository;
    }

    /***
     * Règles de calcul :
     * - si le poids total de la commande est inférieur ou égal à 1kg, fdp = 3€
     * - si le poids total de la commande est compris entre 1kg et 3kg, fdp = 5€
     * - au-delà de 3kg, fdp = 15€
     */
    @Override
    public double calculerFraisPort() {
        List<Livre> livres = contexte.getLivres(livreRepository); // Assuming you have a method to get the books in the order
        double poidsTotal = calculerPoidsTotal(livres);

        if (poidsTotal <= 1.0) {
            return 3.0;
        } else if (poidsTotal <= 3.0) {
            return 5.0;
        } else {
            return 15.0;
        }
        
    }

    // Méthode pour calculer le poids total des livres
    // Méthode pour calculer le poids total des livres
    private double calculerPoidsTotal(List<Livre> livres) {
        double poidsTotal = 0.0;
        for (Livre livre : livres) {
            poidsTotal += livre.getPoids();
        }
        return poidsTotal;
    }

}
