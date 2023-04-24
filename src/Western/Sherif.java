package Western;

public class Sherif extends Cowboy{
    private int nombreBrigandeCoffre = 0;
    public Sherif(String nom) {
        super(nom);
    }

    public int getNombreBrigandeCoffre() {
        return nombreBrigandeCoffre;
    }

    public String getAdjectif(){
        return "Le Honnêt";
    }

    public String getNom(){
        return "Le Sherif " + super.getNom();
    }

    public void coffrer(Brigand brigand){
        System.out.println("("+this.getNom()+")-Au nom de la loi, je vous arrête !");
        this.nombreBrigandeCoffre++;
        super.popularite++;
    }

    public void chercher(Brigand brigand){
        System.out.println("("+this.getNom()+")-OYEZ OYEZ BRAVE GENS !! 200 $ a qui arrêtera " + brigand.getNom() +" le brigand, mort ou vif !!");
    }
    public void sePresenter(){
        super.sePresenter();
        System.out.println("("+this.getNom()+")- J'ai arrêter "+  getNombreBrigandeCoffre() +" Brigands");
    }

}
