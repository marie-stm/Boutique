package TP9;

import java.util.LinkedList;

class Magasin {
    private double depenses;
    private double revenus;
    private LinkedList<Articles> electromenagers;  
    private LinkedList<Articles> primeurs;         

    public Magasin() {
        this.depenses = 0;
        this.revenus = 0;
        electromenagers = new LinkedList<>();
        primeurs = new LinkedList<>();
    }

    
    public void ajouterElectromenager(Electromenager article) {
        electromenagers.add(article);  
    }

    
    public void ajouterPrimeur(Primeurs article) {
        primeurs.add(article);  
    }

    
    public void descriptionMagasin() {
        System.out.println("Dépenses totales : " + depenses);
        System.out.println("Revenus totaux : " + revenus);

       
        System.out.println("\nÉlectroménagers :");
        for (Articles article : electromenagers) {
            article.description();
            System.out.println();
        }

       
        System.out.println("Primeurs :");
        for (Articles article : primeurs) {
            article.description();
            System.out.println();
        }
    }

    
    public double calculerRendementTotal() {
        if (depenses == 0) return 0;  
        return (revenus - depenses) / depenses * 100;
    }

    
    public void vendreElectromenager(int index, int quantite) {
        if (index >= 0 && index < electromenagers.size()) {
            Articles article = electromenagers.get(index);
            if (article instanceof VendablePiece) {
                double revenu = ((VendablePiece) article).vendre(quantite);
                revenus += revenu;
            }
        }
    }

   
    public void vendrePrimeur(int index, double poids) {
        if (index >= 0 && index < primeurs.size()) {
            Articles article = primeurs.get(index);
            if (article instanceof VendableKilo) {
                double revenu = ((VendableKilo) article).vendre(poids);
                revenus += revenu;
            }
        }
    }
}

