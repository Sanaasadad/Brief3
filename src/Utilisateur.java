public class Utilisateur extends Personne {
    String Motdepasse;
    Role role;
    String email;

    public String getMotdepasse() {
        return Motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        Motdepasse = motdepasse;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Utilisateur(String id, String Nom, String prenom, int Age, String email, String motdepasse, Role role) {
        super(id, Nom, prenom, Age);
        this.email = email;
        this.Motdepasse = motdepasse;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "email='" + email + "\n" +
                ", Motdepasse='" + Motdepasse + "\n" +
                ", role=" + role.getRole() + "\n" +
                ", id='" + id + "\n" +
                ", Nom='" + Nom + "\n" +
                ", prenom='" + prenom + "\n" +
                ", Age=" + Age +
                '}';
    }
}
