package TP9;

abstract class Electromenager extends Articles implements VendablePiece, Solde {
    private int stock;

    
    public Electromenager(String nom, String fournisseur, double prixAchat, double prixVente) {
        super(nom, fournisseur, prixAchat, prixVente);
   
    }


    public void remplirStock(int quantite) {
        this.stock += quantite;
    }

    
    public double vendre(int quantite) {
        if (quantite <= stock) {
            stock -= quantite;
            double revenu = prixVente * quantite;
            return revenu;
        } else {
            System.out.println("Stock insuffisant");
            return 0;
        }
    }

	
	  public void lancerSolde(double pourcentage) { prixVente -=
	  prixVente * (pourcentage / 100); }
	  
	  
	  public void terminerSolde(double pourcentage) { prixVente +=
	  prixVente * (pourcentage / 100); }
	  
	  
	  public void description() { super.description();
	  System.out.println("Stock : " + stock + " pièces"); }
	 
}
