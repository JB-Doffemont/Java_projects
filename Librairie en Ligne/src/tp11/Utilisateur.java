package tp11;

import tp11.dto.Entity;
import tp11.dto.UtilisateurDTO;

/******************************************************************
 * Il s'agit d'une entité (voir pattern DTO), autrement dit
 * un objet complexe embarquant de la logique métier.
 * Cet objet propose une méthode toDTO() qui fournira la version légère
 * de cet objet, afin de faciliter les communications.
 *********************************************************************/
public class Utilisateur implements Entity {
    // Liste des attributs : interdiction d'en ajouter/retirer
    private int id;
    private String nom;
    private String email;
    private boolean isPremium = false;

    // Constructeurs
    public Utilisateur() {
        // Constructeur par défaut
    }

    public Utilisateur(int id, String nom, String email, boolean isPremium) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.isPremium = isPremium;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public UtilisateurDTO toDTO() {
        UtilisateurDTO utilisateurDTO = new UtilisateurDTO();
        utilisateurDTO.setId(id);
        utilisateurDTO.setNom(nom);
        utilisateurDTO.setEmail(email);
        utilisateurDTO.setPremium(isPremium);
        return utilisateurDTO;
    }
}
