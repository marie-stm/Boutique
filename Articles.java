package TP9;

class Articles {
    protected double prixAchat;
    protected double prixVente;
    protected String nom;
    protected String fournisseur;

    
    public Articles(String nom, String fournisseur, double prixAchat, double prixVente) {
        this.nom = nom;
        this.fournisseur = fournisseur;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    
    public double calculerRendement() {
        return (prixVente - prixAchat) / prixAchat * 100;
    }

    
    public void description() {
        System.out.println("Produit : " + nom);
        System.out.println("Fournisseur : " + fournisseur);
        System.out.println("Prix d'achat : " + prixAchat);
        System.out.println("Prix de vente : " + prixVente);
        System.out.println("Rendement : " + calculerRendement() + "%");
    }
}
