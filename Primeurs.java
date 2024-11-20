package TP9;


abstract class Primeurs extends Articles implements VendableKilo {
    private double stock;

  
    public Primeurs(String nom, String fournisseur, double prixAchat, double prixVente, double stock) {
        super(nom, fournisseur, prixAchat, prixVente);
        this.stock = 0; 
    }

    
    public void remplirStock(double poids) {
        this.stock += poids;
    }

    
    public double vendre(double poids) {
        if (poids <= stock) {
            stock -= poids;
            double revenu = prixVente * poids;
            return revenu;
        } else {
            System.out.println("Stock insuffisant");
            return 0;
        }
    }

    

    public void description() {
        super.description();
        System.out.println("Stock : " + stock + " kg");
    }
}