package tp11.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tp11.Livre;

/**
 * Implémentation simulée du repository (pas de base de données réelle)
 * Dans une application réelle, le repository sera responsable de la
 * persistance et donc de la connexion/gestion de la base de données.
 */

public class LivreRepositoryImpl implements LivreRepository {
    private Map<Integer, Livre> livres = new HashMap<>();

    // Constructeur par défaut
    public LivreRepositoryImpl() {
        // Initialisation simulée de quelques livres
        Livre livre1 = new Livre(1, "Titre1", "Auteur1", 1.5);
        Livre livre2 = new Livre(2, "Titre2", "Auteur2", 2.0);

        livres.put(livre1.getId(), livre1);
        livres.put(livre2.getId(), livre2);
    }

    @Override
    public Livre findById(int id) {
        return livres.get(id);
    }

    @Override
    public List<Livre> findAll() {
        return new ArrayList<>(livres.values());
    }

    @Override
    public void save(Livre livre) {
        livres.put(livre.getId(), livre);
    }

}