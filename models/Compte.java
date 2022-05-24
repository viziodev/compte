package models;

abstract public class Compte {
    protected int numero;//0
    protected double solde;//0
    private static int nbre;//0
     //Navigabilite => 
      //ManyToOne avec Client
    private Client client;



    //Constructeur par defaut =>  qui n'a pas d'arguments
    public Compte(){
        nbre++;
        numero=nbre;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    //Methodes metier
    public void depot(double mnt){
        solde=solde+mnt;
    }

    public void retrait(double mnt){
        if(mnt<solde){
            solde=solde-mnt;
        }else{
            System.out.println("Montant Insufisant "+solde);
        }
    }

    public void virement(double mnt,Compte cptVir){
        if(mnt<solde){
              this.retrait(mnt);
              cptVir.depot(mnt);
        }else{
            System.out.println("Montant Insufisant "+solde);
        }
    }

    public String  consultation(){
         return "Numero :"+numero+" Solde :"+solde;
    }

}
