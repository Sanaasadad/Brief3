import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     ArrayList<Utilisateur> Comptes = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
    String sa;

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
        sa = scanner.nextLine();
        Role role = new Role(sa);
        Comptes.add(new Utilisateur(id, Nom, prenom, Age, email, motdepasse,role));
    }
    Role role = new Role(sa);
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
void Modifier(){
    System.out.println(" Entrer id de tache qui veux modifier");
    String id = scanner.nextLine();
    for(int i = 0;i<Comptes.size();i++){
        if(Comptes.get(i).getId().equals(id)){

            System.out.println("Entrer le nouveau Nom");
            Comptes.get(i).setNom(scanner.nextLine());


            System.out.println("Entrer le nouveau Prenom");
            Comptes.get(i).setPrenom(scanner.nextLine());


            System.out.println("Entrer le nouveau Age");
            Comptes.get(i).setAge(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Entrer le nouveau email");
            Comptes.get(i).setEmail(scanner.nextLine());


            System.out.println("Entrer le nouveau mot de passe");
            Comptes.get(i).setMotdepasse(scanner.nextLine());


            System.out.println("Entrer le nouveau Role ");
            Comptes.get(i).role.setRole(scanner.nextLine());

        }
    }
}
void supprimer(){
    System.out.println("entrer id de tache qui veux supprimer");
    String id = scanner.nextLine();
    for(int i = 0;i< Comptes.size();i++){
        if(Comptes.get(i).getId().equals(id)){
            Comptes.remove(Comptes.get(i));
            System.out.println("la tache est supprimer!!");
            return;
        }
    }
    System.out.println("aucun livre trouve!!");
}

    public static void main(String[] args) {
         Main programme = new Main();

        int choix;
        do {
            System.out.println("Menu");
            System.out.println("1-Ajouter");
            System.out.println("2-Afficher");
            System.out.println("3-Rechercher");
            System.out.println("4-Modifier");
            System.out.println("5-Supprimer");
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
                    programme.Modifier();
                    break;
                case 5:
                    programme.supprimer();
                    break;
                case 6:
                    System.out.println("au revoir!!");
                    break;
                default:
                    System.out.println("choix invalide");
            }

        } while (choix != 6);
    }
}