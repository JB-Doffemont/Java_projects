package tp11.state;

import tp11.Commande;

/******************************************
 * Interface commune � tous les �tats
 * Un �tat ici se contente de modifier
 * sa commande (son contexte)
 * en modifiant le currentState de celle-ci
 * en pla�ant une instance du nouvel �tat
 * et en modifiant son status
 */
public interface CommandeState {
    void next(Commande commande);
}