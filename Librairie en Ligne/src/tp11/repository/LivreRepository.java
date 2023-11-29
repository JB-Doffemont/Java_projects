package tp11.repository;

import tp11.Livre;
import java.util.List;

/************************************************************
 * Pattern Repository :
 * On d�finit ici notre repository comme un d�p�t permettant de r�aliser a minima les actions suivantes sur une collection de Livre :
 * - trouver un livre d'apr�s son id
 * - renvoyer l'int�gralit� de la collection
 * - ajouter un nouveau livre au d�p�t
 */
public interface LivreRepository {
    Livre findById(int id);
    List<Livre> findAll();
    void save(Livre livre);
}


