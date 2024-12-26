import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     ArrayList<Utilisateur> Comptes = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);

     void Ajouter() {
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
     void Afficher(){
        for(Utilisateur information : Comptes){
                    System.out.println(information);
        }
        }
    void Rechercher(){
        System.out.println("Entrer id de tache qui veux rechercher");
        String id = scanner.nextLine();
        for(Utilisateur u : Comptes){
            if(u.getId().equals(id)){
                System.out.println(u);
            }
return;
        }
        System.out.println("id invalide");

    }


    public static void main(String[] args) {
         Main programme = new Main();

        int choix;
        do {
            System.out.println("Menu");
            System.out.println("1-Ajouter");
            System.out.println("2-Afficher");
            System.out.println("3-Modifier");
            System.out.println("4-Supprimer");
            System.out.println("5-Rechercher");
            System.out.println("6-Quitter");
            System.out.println("choisissez une choix");
            choix = programme.scanner.nextInt();
            programme.scanner.nextLine();

            switch (choix) {
                case 1:
                    programme.Ajouter();
                    break;
                case 2:
                   programme.Afficher();
                    break;
                case 3:
                    programme.Rechercher();
                    break;
                case 4:
                    System.out.println("au revoir!!");
                default:
                    System.out.println("choix invalide");
            }

        } while (choix != 4);
    }
}