public class Coucou {

    public Coucou() {
        int monAnnee = 1986;
        InformationAnnee(monAnnee);
    }

    public void InformationAnnee (int monAnnee) {
        int resultat = monAnnee % 400;
        int resultat2 = monAnnee % 4;
        int resultat3 = monAnnee % 100;

        if(resultat == 0 || (resultat2 == 0 && resultat3 != 0)) {
            System.out.println(monAnnee + " est une année bissextile");
        } else {
            System.out.println(monAnnee + " n'est pas une année bissextile");
        }
    }
}
