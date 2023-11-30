package tp11.adapter;

import tp11.dto.CommandeDTO;

/*****************************************************************************
 * Ici on souhaite adapter notre Commande, et plus particulièrement la
 * version DTO (légère) de notre Commande afin d'utiliser un service externe qui
 * ne connait pas nos objets.
 * Ce service externe (ici représenté par EmailService, une classe simulant
 * l'envoi d'un email)
 * ne peut pas prendre en paramètre un objet DTO et ne peut fonctionner qu'avec
 * des String
 * (voyez cela comme une API). À vous d'écrire un adaptateur permettant de
 * passer d'un
 * CommandeDTO au service. Regardez le Main pour bien comprendre ce que vous
 * devez envoyer exactement comme
 * textes au service d'emails.
 */
public class EmailNotificationAdapter implements NotificationService {
    private EmailService emailService;

    public EmailNotificationAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void envoyerNotification(CommandeDTO commande) {
        String emailContent = buildEmailContent(commande);
        emailService.envoyerEmail(commande.getUtilisateur().getEmail(), "Nouvelle commande", emailContent);
    }

    private String buildEmailContent(CommandeDTO commande) {
        StringBuilder emailContent = new StringBuilder();

        // Append relevant information from CommandeDTO to the email content
        emailContent.append("Utilisateur : ").append(commande.getUtilisateur().getNom()).append("\n");
        emailContent.append("Livres commandés :\n");

        for (int i = 0; i < commande.getLivres().size(); i++) {
            emailContent.append(i + 1).append(". ").append(commande.getLivres().get(i).getTitre()).append("\n");
        }

        // Add any other relevant information...

        return emailContent.toString();
    }
}
