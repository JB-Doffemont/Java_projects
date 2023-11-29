package tp11;

import tp11.dto.Entity;
import tp11.dto.LivreDTO;

/******************************************************************
 * Il s'agit d'une entit� (voir pattern DTO), autrement dit
 * un objet complexe embarquant de la logique m�tier.
 * Cet objet propose une m�thode toDTO() qui fournira la version l�g�re
 * de cet objet, afin de faciliter les communications.
 *********************************************************************/
public class Livre implements Entity {
    // Liste des attributs : interdiction d'en ajouter/retirer
    private int id;
    private String titre;
    private String auteur;
    private double poids;

    public Livre() {
    }

    public Livre(int id, String titre, String auteur, double poids) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.poids = poids;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public LivreDTO toDTO() {

        LivreDTO livreDTO = new LivreDTO();
        livreDTO.setId(id);
        livreDTO.setTitre(titre);
        livreDTO.setAuteur(auteur);
        livreDTO.setPoids(poids);
        return livreDTO;
    }
}
