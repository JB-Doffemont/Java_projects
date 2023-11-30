package tp11.dto;
import java.util.List;


/********************************************************
 * Les DTO sont des objets simplifi�s repr�sentant l'�tat
 * (les attributs) d'un objet complexe, dont on a retir�
 * toute logique m�tier. De ce fait, les DTO deviennent
 * des objets plus faciles � s�rializer et plus l�gers
 **********************************************************/
public class CommandeDTO implements TransferableObject{
    private List<LivreDTO> livres;
    private UtilisateurDTO utilisateur ;
 
    public CommandeDTO(List<LivreDTO> livres, UtilisateurDTO utilisateur) {
        this.livres = livres;
        this.utilisateur = utilisateur;
    }

    public List<LivreDTO> getLivres() {
        return livres;
    }

    public UtilisateurDTO getUtilisateur() {
        return utilisateur;
    }

    public void setLivres(List<LivreDTO> livres) {
        this.livres = livres;
    }

    public void setUtilisateur(UtilisateurDTO utilisateur) {
        this.utilisateur = utilisateur;
    }
    
    
}