public  class Main {
    static void main() {

        String Marque = "Peugeot";
        int Modele = 208;
        int annee = 2021;
        int prix = 14500;

        System.out.println("La voiture "+Marque+" "+Modele+" de l'année "+annee+" au prix de : "+prix+" euros.");

        Voiture v1 = new Voiture();
        v1.marque="Peugeot";
        v1.modele="208";
        v1.annee=2021;
        v1.prix=14500;

        Voiture v2 = new Voiture();
        v2.marque="Renault";
        v2.modele="Clio";
        v2.annee=2000;
        v2.prix=3500;

        Voiture v3 = new Voiture();
        v3.marque="Toyota";
        v3.modele="Yaris";
        v3.annee=2015;
        v3.prix=9800;

    }
}