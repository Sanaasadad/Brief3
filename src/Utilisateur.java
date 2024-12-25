public class Utilisateur extends Personne {

    String email;
    String Motdepasse;
    Role role;

    public Utilisateur(String id, String Nom, String prenom, int Age, String email, String motdepasse) {
        super(id, Nom, prenom, Age);
        this.email = email;
        this.Motdepasse = motdepasse;
    }


}
