import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Utilisateur> Comptes = new ArrayList<>();
    static Scanner valeur = new Scanner(System.in);

    public static void Ajouter() {
        System.out.println("entrer id");
        String id = valeur.nextLine();

        System.out.println("entrer le nom ");
        String Nom = valeur.nextLine();
        System.out.println("entrer le prenom");
        String prenom = valeur.nextLine();
        System.out.println(" entrer votre age ");
        int Age = valeur.nextInt();
        System.out.println(" entrer votre email");
        String email = valeur.nextLine();
        valeur.nextLine();
        System.out.println("entrer votre mot de passe");
        String motdepasse = valeur.nextLine();
        System.out.println("entrer votre role");
        String role = valeur.nextLine();

        Comptes.add((Utilisateur) new Personne(id, Nom, prenom, Age));

    }

    public static void main(String[] args) {
        int choix;
        do {
            System.out.println("Menu");
            System.out.println("1-Ajouter");
            System.out.println("2-Rechercher");
            System.out.println("3-Modifier");
            System.out.println("4-Supprimer");
            System.out.println("5-Afficher");
            choix = valeur.nextInt();
            valeur.nextLine();

            switch (choix) {
                case 1:
                    Ajouter();
                case 2:
                    System.out.println("au revoir!!");
                default:
                    System.out.println("choix invalide");
            }

        } while (choix != 2);
    }
}