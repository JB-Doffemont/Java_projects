package CommandeManagerTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.practice.designpattern.commande.CommandeManager;
import com.practice.designpattern.commande.Commande;
 
public class CommandeManagerTest {
   
    @Test
    void testSingleInstance() {
    	/* Test pour vérifier que commandeManager a crée une seule instance
    	 *  et que les deux instances pointent vers la même référence
    	 */
    	CommandeManager commandeManager = CommandeManager.getinstance();
    	CommandeManager commandeManager1 = CommandeManager.getinstance();
    	
    	System.out.println(commandeManager);
    	System.out.println(commandeManager1);
    }
 
//    @Test
//    void testMultithreading() {
//        // TODO: Tester l'instanciation de CommandeManager dans un contexte multithread
//    }
//   
    
    @Test
    void testCommandeManagement() {
    	// Test ajout de nouvelles commandes
        CommandeManager commandeManager = CommandeManager.getinstance();
        Commande nouvelleCommande = new Commande(182, "Fromage", 1, "3 rue de la pizza", "En cours de livraison");
        Commande nouvelleCommande1 = new Commande(183, "Vegetarienne", 1, "2 boulevard du médecin", "En cours de livraison");
        commandeManager.ajouterCommande(nouvelleCommande);
        commandeManager.ajouterCommande(nouvelleCommande1);
        commandeManager.imprimerListeCommandes();
        
        // Test modification d'une commande
        commandeManager.modifierCommande(183, "Chorizo", 4, "2 boulevard du médecin", "En cours de livraison");
        commandeManager.imprimerListeCommandes();
        
        // Test pour supprimer une commande 
        commandeManager.supprimerCommande(183);
        commandeManager.imprimerListeCommandes();
    }
}
 