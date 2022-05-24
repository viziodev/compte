package models;

public class Epargne extends Compte {
    public static final double  TAUX=0.18;

    public Epargne(){
        super();//Constructeur de Compte
    }

    @Override //Reecrite ou Redefinie
    public void depot(double mnt) {
          solde+=mnt+ mnt*TAUX;
    }

    @Override
    public void retrait(double mnt) {
        System.out.println("Ce Compte est bloque  ");
    }

    @Override
    public void virement(double mnt, Compte cptVir) {
        System.out.println("Ce Compte est bloque  ");
    }
    
}

//Epargne ep=new Epargne()  =>  new Compte()
