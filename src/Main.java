import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Utilisateur> Comptes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void Ajouter() {
        System.out.println("entrer id");
        String id = scanner.nextLine();

        System.out.println("entrer le nom ");
        String Nom = scanner.nextLine();
        System.out.println("entrer le prenom");
        String prenom = scanner.nextLine();
        System.out.println(" entrer votre age ");
        int Age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" entrer votre email");
        String email = scanner.nextLine();
        System.out.println("entrer votre mot de passe");
        String motdepasse = scanner.nextLine();
        System.out.println("entrer votre role : administrateur, Emlpoyer, Client");
        String sa = scanner.nextLine();
        Role role = new Role(sa);

        Comptes.add(new Utilisateur(id, Nom, prenom, Age, email, motdepasse,role));

    }
    public static void Afficher(){
        for(Utilisateur information : Comptes){
                    System.out.println(information);
        }
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
            System.out.println("choisissez une choix");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    Ajouter();
                    break;
                case 2:
                    Afficher();
                    break;
                case 3:
                    System.out.println("au revoir!!");
                default:
                    System.out.println("choix invalide");
            }

        } while (choix != 3);
    }
}