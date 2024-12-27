

public class Personne {
    String id;
    String Nom, prenom;
    int Age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }




public Personne(String id, String Nom, String prenom,int Age){
    this.id = id;
    this.Nom = Nom;
    this.prenom = prenom;
    this.Age = Age;

}



}
