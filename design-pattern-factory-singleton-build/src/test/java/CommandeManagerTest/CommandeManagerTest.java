package CommandeManagerTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.practice.designpattern.commande.CommandeManager;
import com.practice.designpattern.commande.Commande;

/**
 * Classe de test pour la classe CommandeManager, utilisant JUnit 5.
 */
public class CommandeManagerTest {

    @Test
    void testSingleInstance() {
        /* Test pour vérifier que CommandeManager a créé une seule instance
         * et que les deux instances pointent vers la même référence.
         */
        CommandeManager commandeManager = CommandeManager.getInstance();
        CommandeManager commandeManager1 = CommandeManager.getInstance();

        // Comparaison des références des deux instances
        assertSame(commandeManager, commandeManager1);
    }

    @Test
    void testMultithreading() {
        // Test pour vérifier la robustesse du singleton dans un environnement multithread.
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                CommandeManager commandeManager = CommandeManager.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CommandeManager commandeManager = CommandeManager.getInstance();
            }
        });

        // Démarrage des threads
        t1.start();
        t2.start();

        // Attendre la fin des threads
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testCommandeManagement() {
        // Test ajout de nouvelles commandes
        CommandeManager commandeManager = CommandeManager.getInstance();
        Commande nouvelleCommande = new Commande(182, "Fromage", 1, "3 rue de la pizza", "En cours de livraison");
        Commande nouvelleCommande1 = new Commande(183, "Vegetarienne", 1, "2 boulevard du médecin", "En cours de livraison");
        commandeManager.ajouterCommande(nouvelleCommande);
        commandeManager.ajouterCommande(nouvelleCommande1);

        // Affichage de la liste des commandes
        commandeManager.imprimerListeCommandes();

        // Test modification d'une commande
        commandeManager.modifierCommande(183, "Chorizo", 4, "2 boulevard du médecin", "En cours de livraison");
        commandeManager.imprimerListeCommandes();

        // Test pour supprimer une commande
        commandeManager.supprimerCommande(183);
        commandeManager.imprimerListeCommandes();
    }
}
