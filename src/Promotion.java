import java.util.ArrayList;

public class Promotion {

    ArrayList<Etudiant> listeEleves = new ArrayList<>();

    public Promotion() {
        listeEleves.add(new Etudiant("Thaize", "Michael", 31));
        listeEleves.add(new Etudiant("Jean", "René", 24));
        listeEleves.add(new Etudiant("Louis", "Bernard", 59));
    }

    public void moyenneAge() {
        if (listeEleves.size() > 0) {
            int moyenneAge = 0;
            int totalEleves = listeEleves.size();

            for (int i = 0; i < listeEleves.size(); i++) {
                moyenneAge = moyenneAge + listeEleves.get(i).age;
            }
            totalEleves = moyenneAge / totalEleves;
            System.out.println("La moyenne d'age est de " + totalEleves + " ans.");
        } else {
            System.out.println("Aucun élève dans votre liste");
        }
    }
}
