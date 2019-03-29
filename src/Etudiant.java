public class Etudiant {

    String nom;
    String prenom;
    Integer age;


    public Etudiant(String nom, String prenom, Integer age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void affichageInfos() {
        System.out.println("Bienvenue, " + nom.toUpperCase() +" " + prenom.toUpperCase().substring(0, 1) + prenom.toLowerCase().substring(1) + " Age : " + age +" ans.");
    }
}
