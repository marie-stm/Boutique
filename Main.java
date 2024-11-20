package TP9;

public class Main {
    public static void main(String[] args) {
        
        Magasin magasin = new Magasin();

        Electromenager frigo = new Electromenager("Frigo", "LG", 300, 500);
        Electromenager laveLinge = new Electromenager("Lave-linge", "Samsung", 400, 600);
        Primeurs pomme = new Primeurs("Pomme", "Verger Bio", 2, 3);
        Primeurs carotte = new Primeurs("Carotte", "Ferme Locale", 1.5, 2.5);

       
        magasin.ajouterElectromenager(frigo);
        magasin.ajouterElectromenager(laveLinge);
        magasin.ajouterPrimeur(pomme);
        magasin.ajouterPrimeur(carotte);

        frigo.remplirStock(10);     
        laveLinge.remplirStock(5); 
        pomme.remplirStock(100);    
        carotte.remplirStock(200);  

        
        magasin.vendreElectromenager(0, 2);  
        magasin.vendreElectromenager(1, 1);  
        magasin.vendrePrimeur(0, 20);        
        magasin.vendrePrimeur(1, 50);        

        
        System.out.println("État du magasin après les ventes :");
        magasin.descriptionMagasin();

        
        double rendementTotal = magasin.calculerRendementTotal();
        System.out.println("Taux de rendement global : " + rendementTotal + "%");
    }
}
