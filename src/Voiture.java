public class Voiture {

    String marque;
    String modele;
    int annee;
    String carburant;
    double prix;
    Pneus type_pneu;

    public Voiture(String marque, String modele, int annee, double prix, Pneus pneu) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        this.type_pneu = pneu;
    }
}
